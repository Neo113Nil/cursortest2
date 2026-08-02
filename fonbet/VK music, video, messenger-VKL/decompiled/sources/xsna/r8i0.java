package xsna;

import android.text.Editable;
import android.view.View;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.music.stats.CoachMarkAction;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class r8i0 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r8i0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                s8i0 s8i0Var = (s8i0) this.c;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.d;
                androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) this.e;
                if (s8i0Var.e != null) {
                    Editable text = ((VkInputSelect) ref$ObjectRef.element).getText();
                    String obj = text != null ? text.toString() : null;
                    if (obj == null) {
                        obj = "";
                    }
                    String str = obj;
                    io.reactivex.rxjava3.core.x e = gu50.e((gu50) s8i0Var.n.getValue(), s8i0Var.d, str, null, null, null, null, 60);
                    asu0 asu0Var = asu0.a;
                    s8i0Var.p.b(e.q(asu0Var.c()).m(asu0Var.d()).subscribe(new tmz(new ea3(dVar, s8i0Var, str), 12), new ow40(new ape0(dVar, 4), 15)));
                    break;
                }
                break;
            default:
                diu0 diu0Var = (diu0) this.c;
                UIBlockHint uIBlockHint = (UIBlockHint) this.d;
                gzs gzsVar = (gzs) this.e;
                diu0Var.b.a(new n680(uIBlockHint, CoachMarkAction.CLICK_TARGET_AREA));
                gzsVar.invoke();
                break;
        }
    }
}
