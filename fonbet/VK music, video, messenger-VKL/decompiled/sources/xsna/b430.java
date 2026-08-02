package xsna;

import android.content.Context;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import com.vk.dto.common.Image;
import com.vk.ecomm.moderation.api.restrictions.ModerationCheckAdultResult;
import com.vk.ecomm.moderation.api.restrictions.ModerationRestriction;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.f5h0;
import xsna.x530;

/* compiled from: ModerationAdultRestrictionsBinder.kt */
/* loaded from: classes18.dex */
public final class b430 implements d430 {
    public final k530 a;
    public final y330 b;
    public final boolean c;
    public final Context d;
    public final String e;
    public final String f;
    public final bpn0 g = new bpn0(new nd1(23));
    public final jwx h = new jwx(3, 20);

    /* compiled from: ModerationAdultRestrictionsBinder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ModerationCheckAdultResult.values().length];
            try {
                iArr[ModerationCheckAdultResult.ONLY_FOR_ADULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ModerationCheckAdultResult.CONFIRM_ADULT_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ModerationRestriction.values().length];
            try {
                iArr2[ModerationRestriction.BLUR.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ModerationRestriction.BLUR_ONLY_FOR_ADULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public b430(k530 k530Var, y330 y330Var, boolean z, Context context) {
        this.a = k530Var;
        this.b = y330Var;
        this.c = z;
        this.d = context;
        this.e = context.getString(R.string.moderation_restriction_good_title);
        this.f = context.getString(R.string.moderation_restriction_good_price);
    }

    @Override // xsna.d430
    public final ModerationRestriction a(c530 c530Var) {
        int i = a.$EnumSwitchMapping$0[this.b.a(c530Var.b, c530Var.a).ordinal()];
        return i != 1 ? i != 2 ? ModerationRestriction.NONE : ModerationRestriction.BLUR : ModerationRestriction.BLUR_ONLY_FOR_ADULT;
    }

    @Override // xsna.d430
    public final boolean b(c530 c530Var, ModerationRestriction moderationRestriction, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        int i = a.$EnumSwitchMapping$1[moderationRestriction.ordinal()];
        if (i == 1) {
            k530.b(this.a, this.d, this.c, gzsVar, null, 8);
            return true;
        }
        if (i != 2) {
            return false;
        }
        this.a.a(this.d, this.c);
        return true;
    }

    @Override // xsna.d430
    public final boolean c(c530 c530Var, ModerationRestriction moderationRestriction, x530.a aVar) {
        return b(c530Var, moderationRestriction, aVar, aVar);
    }

    @Override // xsna.d430
    public final boolean d(c530 c530Var, f530 f530Var, izs<? super ModerationRestriction, s3q0> izsVar, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        ArrayList arrayList;
        njt hierarchy;
        njt hierarchy2;
        ModerationRestriction a2 = a(c530Var);
        Integer num = c530Var.d;
        p530 k1 = f530Var.k1(num);
        if (a2 == ModerationRestriction.NONE) {
            VKImageView vKImageView = k1.b;
            if (vKImageView != null) {
                vKImageView.setPostprocessor(null);
            }
            if (vKImageView != null && (hierarchy2 = vKImageView.getHierarchy()) != null) {
                hierarchy2.n(null);
            }
            if (vKImageView != null && (hierarchy = vKImageView.getHierarchy()) != null) {
                hierarchy.r(null, 0);
            }
            f530Var.o1(num);
            return false;
        }
        Image image = c530Var.e.d;
        VKImageView vKImageView2 = k1.b;
        if (vKImageView2 != null) {
            a5h0 a5h0Var = new a5h0(new baf0(krv0.e(R.drawable.vk_icon_hide_outline_28, this.d), -1), f5h0.g.a);
            njt hierarchy3 = vKImageView2.getHierarchy();
            if (hierarchy3 != null) {
                hierarchy3.r(a5h0Var, 0);
            }
            vKImageView2.setActualColorFilter((PorterDuffColorFilter) this.g.getValue());
            vKImageView2.setPostprocessor(this.h);
            vKImageView2.load((image == null || (arrayList = image.b) == null) ? null : ixj0.n(arrayList));
        }
        TextView textView = k1.c;
        if (textView != null) {
            textView.setText(this.e);
        }
        TextView textView2 = k1.d;
        if (textView2 != null) {
            textView2.setText(this.f);
        }
        TextView textView3 = k1.e;
        if (textView3 != null) {
            textView3.setText((CharSequence) null);
        }
        View view = k1.f;
        if (view != null) {
            view.setVisibility(8);
        }
        jjc.g(k1.a, new p83(this, c530Var, a2, gzsVar));
        izsVar.invoke(a2);
        return true;
    }
}
