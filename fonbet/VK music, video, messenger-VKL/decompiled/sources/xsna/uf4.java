package xsna;

import android.content.Context;
import android.widget.CompoundButton;
import com.vk.core.view.components.radio.VkRadioButton;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class uf4 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uf4(int i, ks80 ks80Var) {
        this.b = 1;
        this.c = i;
        this.d = ks80Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                String str = (String) this.d;
                int i = this.c;
                qyg0 V0 = ((hyg0) obj).V0("\n        SELECT COUNT(*) \n        FROM audio_book_to_chapters \n        WHERE uid = ? AND book_id = ?\n    ");
                try {
                    V0.D3(1, str);
                    V0.bindLong(2, i);
                    int i2 = V0.step() ? (int) V0.getLong(0) : 0;
                    V0.close();
                    return Integer.valueOf(i2);
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 1:
                ks80 ks80Var = (ks80) this.d;
                jk3 e = new lk3().a(this.c, "index").e();
                ohk0 f = ks80Var.f().f((String) obj);
                if (f != null) {
                    f.j("onPlaylistItemIndexChanged", e);
                }
                return s3q0.a;
            default:
                final rg50 rg50Var = (rg50) this.d;
                VkRadioButton vkRadioButton = new VkRadioButton((Context) obj, null, 6);
                final int i3 = this.c;
                vkRadioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xsna.oue0
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        if (z) {
                            rg50Var.C(i3);
                        }
                    }
                });
                return vkRadioButton;
        }
    }

    public /* synthetic */ uf4(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }
}
