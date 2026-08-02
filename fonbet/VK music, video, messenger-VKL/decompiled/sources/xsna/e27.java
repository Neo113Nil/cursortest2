package xsna;

import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vk.profile.user.impl.ui.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ttq0;

/* compiled from: BigSnippetHolder.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class e27 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e27(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (Boolean) ((mcy) this.receiver).get();
            case 1:
                sal0 sal0Var = (sal0) this.receiver;
                int i = sal0.i;
                sal0Var.getClass();
                y8w0 y8w0Var = new y8w0(0);
                y8w0Var.e = Boolean.TRUE;
                y8w0Var.f = "vmoji_avatar_suggestion_stickers_keyboard_hint";
                d6w0.a(b6m.e(), sal0Var.getContext(), "vmoji_suggestion_hint", y8w0Var.a(), 8);
                return s3q0.a;
            case 2:
                ttq0 ttq0Var = (ttq0) this.receiver;
                zuq0 zuq0Var = ttq0Var.n;
                int i2 = ttq0.b.$EnumSwitchMapping$0[((UserProfileAdapterItem.PromoButtons.BirthdayPromo.BirthdayHiddenTooltip.LinkType) ((zak0) ttq0Var.q).getValue()).ordinal()];
                if (i2 == 1) {
                    zuq0Var.B(new f.e.m0(((UserProfileAdapterItem.PromoButtons.BirthdayPromo.BirthdayHiddenTooltip) ttq0Var.m).g));
                } else if (i2 == 2 || i2 == 3) {
                    zuq0Var.B(new f.e.i1(((UserProfileAdapterItem.PromoButtons.BirthdayPromo.BirthdayHiddenTooltip) ttq0Var.m).g));
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ttq0Var.t6(((UserProfileAdapterItem.PromoButtons.BirthdayPromo.BirthdayHiddenTooltip) ttq0Var.m).g);
                }
                return s3q0.a;
            default:
                ((com.vk.registration.funnels.b) this.receiver).getClass();
                com.vk.registration.funnels.b.p();
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e27(Object obj, int i) {
        super(0, obj, ttq0.class, "onClick", "onClick()V", 0);
        this.b = i;
        switch (i) {
            case 3:
                super(0, obj, com.vk.registration.funnels.b.class, "onNoAvailableFactors", "onNoAvailableFactors()V", 0);
                break;
            default:
                break;
        }
    }
}
