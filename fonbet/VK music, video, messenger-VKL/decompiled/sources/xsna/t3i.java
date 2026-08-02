package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.dto.common.VerifyInfo;
import com.vk.profile.design.view.ProfileTitleText;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.l3h;

/* compiled from: CommunityTitleViewDataDelegate.kt */
/* loaded from: classes5.dex */
public final class t3i {

    /* compiled from: CommunityTitleViewDataDelegate.kt */
    public static final class a extends ClickableSpan {
        public final /* synthetic */ gzs<s3q0> b;

        public a(gzs<s3q0> gzsVar) {
            this.b = gzsVar;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            this.b.invoke();
        }
    }

    /* compiled from: CommunityTitleViewDataDelegate.kt */
    public static final class b extends ClickableSpan {
        public final /* synthetic */ FunctionReferenceImpl b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(gzs<s3q0> gzsVar) {
            this.b = (FunctionReferenceImpl) gzsVar;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            this.b.invoke();
        }
    }

    public static void a(ProfileTitleText profileTitleText, String str, VerifyInfo verifyInfo, l3h.b bVar, boolean z, boolean z2, boolean z3, boolean z4, gzs gzsVar, gzs gzsVar2, gzs gzsVar3, gzs gzsVar4) {
        ucp ucpVar = ucp.a;
        int i = 0;
        ProfileTitleText.b(profileTitleText, ucp.i(str), null, false);
        if (!z2 && !z3) {
            if (z4) {
                c(profileTitleText, gzsVar);
                return;
            }
            if (verifyInfo.Cb()) {
                d(profileTitleText, verifyInfo, z);
                return;
            } else {
                if (bVar != null) {
                    if (bVar.a || bVar.b) {
                        b(profileTitleText, bVar, z, gzsVar2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (z3) {
            Drawable e = enj.e(R.drawable.vk_icon_verified_20, R.attr.vk_ui_icon_accent, profileTitleText.getContext());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) rik0.b(4.0f));
            int a2 = iah0.a(2);
            Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(" ");
            e.setBounds(0, 0, e.getIntrinsicWidth(), e.getIntrinsicHeight());
            newSpannable.setSpan(new tzx0(e, 1, -1.0f, false, a2, 0, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) newSpannable);
            spannableStringBuilder.setSpan(new v3i(gzsVar4, i), 0, spannableStringBuilder.length(), 33);
            profileTitleText.e(new SpannedString(spannableStringBuilder));
            profileTitleText.setMovementMethod(LinkMovementMethod.getInstance());
            return;
        }
        if (verifyInfo.Cb()) {
            d(profileTitleText, verifyInfo, z);
            return;
        }
        if (!z2) {
            if (z4) {
                c(profileTitleText, gzsVar);
                return;
            } else {
                if (bVar != null) {
                    if (bVar.a || bVar.b) {
                        b(profileTitleText, bVar, z, gzsVar2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        Drawable e2 = enj.e(R.drawable.vk_icon_verified_20, R.attr.vk_ui_icon_secondary, profileTitleText.getContext());
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) rik0.b(4.0f));
        int a3 = iah0.a(2);
        Spannable newSpannable2 = Spannable.Factory.getInstance().newSpannable(" ");
        e2.setBounds(0, 0, e2.getIntrinsicWidth(), e2.getIntrinsicHeight());
        newSpannable2.setSpan(new tzx0(e2, 1, -1.0f, false, a3, 0, 0), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) newSpannable2);
        spannableStringBuilder2.setSpan(new u3i(gzsVar3), 0, spannableStringBuilder2.length(), 33);
        profileTitleText.e(new SpannedString(spannableStringBuilder2));
        profileTitleText.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static void b(ProfileTitleText profileTitleText, l3h.b bVar, boolean z, gzs gzsVar) {
        Drawable e;
        Context context = profileTitleText.getContext();
        if (bVar.b) {
            e = enj.d(R.drawable.vk_icon_crown_verified_20, z ? R.color.vk_white : R.color.vk_blue_200, context);
        } else {
            e = bVar.a ? enj.e(R.drawable.vk_icon_verified_20, R.attr.vk_ui_icon_secondary, context) : null;
        }
        Drawable drawable = e;
        if (drawable == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) rik0.b(6.0f));
        int a2 = iah0.a(3);
        int a3 = iah0.a(20);
        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(" ");
        if (a3 <= 0 || a3 <= 0) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        } else {
            drawable.setBounds(0, 0, a3, a3);
        }
        newSpannable.setSpan(new tzx0(drawable, 1, -1.0f, false, a2, 0, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) newSpannable);
        spannableStringBuilder.setSpan(new a(gzsVar), 0, spannableStringBuilder.length(), 33);
        profileTitleText.e(new SpannedString(spannableStringBuilder));
        profileTitleText.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static void c(ProfileTitleText profileTitleText, gzs gzsVar) {
        Drawable e = enj.e(R.drawable.vk_icon_flag_16, R.attr.vk_ui_icon_accent, profileTitleText.getContext());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) rik0.b(4.0f));
        int a2 = iah0.a(2);
        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(" ");
        e.setBounds(0, 0, e.getIntrinsicWidth(), e.getIntrinsicHeight());
        newSpannable.setSpan(new tzx0(e, 1, -1.0f, false, a2, 0, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) newSpannable);
        spannableStringBuilder.setSpan(new b(gzsVar), 0, spannableStringBuilder.length(), 33);
        profileTitleText.e(new SpannedString(spannableStringBuilder));
        profileTitleText.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static void d(ProfileTitleText profileTitleText, VerifyInfo verifyInfo, boolean z) {
        Drawable j = VerifyInfoHelper.j(VerifyInfoHelper.a, profileTitleText.getContext(), verifyInfo, false, z ? VerifyInfoHelper.ColorTheme.white : VerifyInfoHelper.ColorTheme.normal, 4);
        if (j != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) rik0.b(4.0f));
            int a2 = iah0.a(2);
            Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(" ");
            j.setBounds(0, 0, j.getIntrinsicWidth(), j.getIntrinsicHeight());
            newSpannable.setSpan(new tzx0(j, 3, -1.0f, false, a2, 0, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) newSpannable);
            profileTitleText.e(new SpannedString(spannableStringBuilder));
        }
    }
}
