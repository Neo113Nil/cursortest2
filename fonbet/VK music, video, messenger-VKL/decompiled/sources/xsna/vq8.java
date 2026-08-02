package xsna;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.vk.core.view.components.button.VkButton;
import com.vk.profile.questions.impl.d;
import com.vk.stat.scheme.SchemeStat$TypeQuestionItem;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class vq8 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vq8(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                wh50 wh50Var = (wh50) this.c;
                VkButton vkButton = (VkButton) this.d;
                wh50Var.setValue(Boolean.TRUE);
                vkButton.setLoading(true);
                new Handler(Looper.getMainLooper()).postDelayed(new wq8(0, wh50Var, vkButton), 2000L);
                break;
            case 1:
                ((t0p) this.c).a.invoke(((s0p) this.d).a);
                break;
            default:
                com.vk.profile.questions.impl.e eVar = (com.vk.profile.questions.impl.e) this.c;
                d.c cVar = (d.c) this.d;
                eVar.l.c(cVar);
                iqe0.a(cVar, SchemeStat$TypeQuestionItem.Type.OPEN_PROFILE);
                break;
        }
    }
}
