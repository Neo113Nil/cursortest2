package defpackage;

import android.media.AudioManager;
import com.ryanheise.audio_session.a;

/* loaded from: classes11.dex */
public final /* synthetic */ class o72 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o72(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        ue3 ue3Var;
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                a aVar = (a) obj;
                if (i == -1) {
                    aVar.a();
                }
                aVar.e("onAudioFocusChanged", Integer.valueOf(i));
                break;
            default:
                vf3 vf3Var = (vf3) obj;
                vf3Var.getClass();
                if (i != -3 && i != -2) {
                    if (i == -1) {
                        uf3 uf3Var = vf3Var.c;
                        if (uf3Var != null) {
                            uf3Var.executePlayerCommand(-1);
                        }
                        vf3Var.a();
                        vf3Var.b(1);
                        break;
                    } else if (i == 1) {
                        vf3Var.b(2);
                        uf3 uf3Var2 = vf3Var.c;
                        if (uf3Var2 != null) {
                            uf3Var2.executePlayerCommand(1);
                            break;
                        }
                    } else {
                        xvz.v(i, "Unknown focus change type: ");
                        break;
                    }
                } else if (i != -2 && ((ue3Var = vf3Var.d) == null || ue3Var.a != 1)) {
                    vf3Var.b(4);
                    break;
                } else {
                    uf3 uf3Var3 = vf3Var.c;
                    if (uf3Var3 != null) {
                        uf3Var3.executePlayerCommand(0);
                    }
                    vf3Var.b(3);
                    break;
                }
                break;
        }
    }
}
