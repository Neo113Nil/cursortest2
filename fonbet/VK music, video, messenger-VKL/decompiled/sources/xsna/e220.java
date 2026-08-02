package xsna;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.profile.community.members.impl.ui.MembersState;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class e220 implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e220(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        switch (this.b) {
            case 0:
                gzs gzsVar = (gzs) this.c;
                gzs gzsVar2 = (gzs) this.d;
                z37 z37Var = (z37) obj;
                MembersState membersState = (MembersState) obj2;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    i = (aVar.J(z37Var) ? 4 : 2) | intValue;
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= aVar.J(membersState) ? 32 : 16;
                }
                if (aVar.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-142533892, i, -1, "com.vk.profile.community.members.impl.ui.MembersScreen.<anonymous> (MembersScreen.kt:113)");
                    }
                    hr80.f.a(6, aVar, kai.c(1536245662, new f95(membersState, gzsVar, z37Var, gzsVar2), aVar));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                wte0 wte0Var = (wte0) this.c;
                izs izsVar = (izs) this.d;
                xvy xvyVar = (xvy) obj;
                q630 q630Var = (q630) obj2;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i2 = (aVar2.J(xvyVar) ? 4 : 2) | intValue2;
                } else {
                    i2 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i2 |= aVar2.J(q630Var) ? 32 : 16;
                }
                if (aVar2.t(i2 & 1, (i2 & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1911453980, i2, -1, "com.vk.music.stickyplayer.presentation.components.radio.RadioPlaybackQueue.Content.<anonymous> (RadioPlaybackQueue.kt:41)");
                    }
                    wte0Var.c((i2 & 14) | ((i2 << 3) & 896), aVar2, izsVar, xvyVar, q630Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                VkInputSelect vkInputSelect = (VkInputSelect) this.d;
                CharSequence charSequence = (CharSequence) obj;
                ((Integer) obj2).intValue();
                ((Integer) obj3).intValue();
                ((Integer) obj4).intValue();
                if (charSequence == null || !(!drm0.N(charSequence))) {
                    Drawable background = ((View) ref$ObjectRef.element).getBackground();
                    if (background != null) {
                        background.setTint(vkInputSelect.getContext().getColor(R.color.vk_gray_300));
                    }
                    ((View) ref$ObjectRef.element).setEnabled(false);
                } else {
                    ((View) ref$ObjectRef.element).getBackground().setTint(vkInputSelect.getContext().getColor(R.color.vk_white));
                    ((View) ref$ObjectRef.element).setEnabled(true);
                }
                break;
        }
        return s3q0.a;
    }
}
