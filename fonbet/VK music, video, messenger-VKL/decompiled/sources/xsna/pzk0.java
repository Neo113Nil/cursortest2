package xsna;

import android.content.Context;
import android.graphics.PointF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.drawee.generic.RoundingParams;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.user.stack.VkUserStackOld;
import com.vk.dto.common.LinkButton;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.EmptyList;

/* compiled from: StatusImagePopupView.kt */
/* loaded from: classes5.dex */
public final class pzk0 extends FrameLayout {
    public final VKImageView b;
    public final VKImageView c;
    public final TextView d;
    public final TextView e;
    public final VkUserStackOld f;
    public final TextView g;
    public final LinearLayout h;
    public final TextView i;
    public final View j;
    public View.OnClickListener k;
    public izs<? super LinkButton, s3q0> l;
    public final lzk0 m;

    public pzk0(Context context) {
        super(context, null, 0);
        lzk0 lzk0Var = new lzk0(m33.a(R.drawable.vk_icon_cancel_16, context));
        this.m = lzk0Var;
        LayoutInflater.from(context).inflate(R.layout.status_popup, (ViewGroup) this, true);
        VKImageView vKImageView = (VKImageView) findViewById(R.id.background);
        this.b = vKImageView;
        this.c = (VKImageView) findViewById(R.id.photo);
        this.d = (TextView) findViewById(R.id.title);
        this.e = (TextView) findViewById(R.id.text);
        this.f = (VkUserStackOld) findViewById(R.id.participants_photos);
        this.g = (TextView) findViewById(R.id.participants_text);
        this.h = (LinearLayout) findViewById(R.id.buttons_container);
        this.i = (TextView) findViewById(R.id.terms);
        View findViewById = findViewById(R.id.dismiss_button);
        this.j = findViewById;
        findViewById.setBackground(lzk0Var);
        njt hierarchy = vKImageView.getHierarchy();
        hierarchy.l(2).s(new PointF(0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        njt hierarchy2 = vKImageView.getHierarchy();
        float a = cn70.a() * 12.0f;
        float a2 = cn70.a() * 12.0f;
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.e(a, a2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        roundingParams.i = true;
        hierarchy2.u(roundingParams);
    }

    public final void a(int i, ArrayList arrayList) {
        VkUserStackOld vkUserStackOld = this.f;
        if (arrayList == null || arrayList.isEmpty()) {
            vkUserStackOld.setCounter(null);
            vkUserStackOld.setAvatars(EmptyList.b);
            bwt0.p0(vkUserStackOld, false);
            return;
        }
        vkUserStackOld.setSize(VkUserStackOld.b.C0886b.a);
        vkUserStackOld.setPosition(VkUserStackOld.a.c.a);
        vkUserStackOld.setCounter(i > 0 ? Integer.valueOf(i) : null);
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new vlw((String) it.next(), null));
        }
        vkUserStackOld.setAvatars(arrayList2);
        bwt0.p0(vkUserStackOld, true);
    }

    public final VkButton b(LinkButton linkButton) {
        VkButton vkButton = new VkButton(getContext(), null, 6, 0);
        vkButton.setAppearance(VkButton.Appearance.Accent);
        vkButton.setSize(VkButton.Size.Large);
        String str = linkButton.d;
        vkButton.setMode(epx.f(str, "primary") ? VkButton.Mode.Primary : epx.f(str, X3.i.Y) ? VkButton.Mode.Secondary : VkButton.Mode.Tertiary);
        vkButton.setText(linkButton.b);
        bwt0.i0(vkButton, new ozk0(0, linkButton, this));
        return vkButton;
    }

    public final void setButtons(List<LinkButton> list) {
        List<LinkButton> list2 = list;
        LinearLayout linearLayout = this.h;
        if (list2 == null || list2.isEmpty()) {
            bwt0.p0(linearLayout, false);
            return;
        }
        linearLayout.removeAllViews();
        if ((list2 instanceof List) && (list2 instanceof RandomAccess)) {
            List<LinkButton> list3 = list2;
            int size = list3.size();
            for (int i = 0; i < size; i++) {
                VkButton b = b(list3.get(i));
                int childCount = linearLayout.getChildCount();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, cn70.b(44));
                layoutParams.topMargin = childCount > 0 ? cn70.b(8) : 0;
                linearLayout.addView(b, layoutParams);
            }
        } else {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                VkButton b2 = b((LinkButton) it.next());
                int childCount2 = linearLayout.getChildCount();
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, cn70.b(44));
                layoutParams2.topMargin = childCount2 > 0 ? cn70.b(8) : 0;
                linearLayout.addView(b2, layoutParams2);
            }
        }
        bwt0.p0(linearLayout, true);
    }

    public final void setEnabledClickButtons(boolean z) {
        for (View view : awt0.d(this.h)) {
            view.setClickable(z);
            view.setFocusable(z);
        }
    }

    public final void setIsPhotoRoundAsCircle(boolean z) {
        RoundingParams roundingParams;
        njt hierarchy = this.c.getHierarchy();
        if (z) {
            roundingParams = RoundingParams.a();
            roundingParams.f = dhr0.t.c(R.attr.vk_ui_image_border_alpha);
            roundingParams.d(cn70.a() * 0.5f);
            roundingParams.i = true;
        } else {
            roundingParams = null;
        }
        hierarchy.u(roundingParams);
    }

    public final void setOnButtonsClickListener(View.OnClickListener onClickListener) {
        this.k = onClickListener;
    }

    public final void setOnDismissButtonClickListener(View.OnClickListener onClickListener) {
        this.j.setOnClickListener(onClickListener);
    }

    public final void setParticipantsText(CharSequence charSequence) {
        TextView textView = this.g;
        textView.setText(charSequence);
        bwt0.p0(textView, !(charSequence == null || charSequence.length() == 0));
    }

    public final void setPerformClickActionButton(izs<? super LinkButton, s3q0> izsVar) {
        this.l = izsVar;
    }

    public final void setTerms(CharSequence charSequence) {
        TextView textView = this.i;
        textView.setText(charSequence);
        bwt0.p0(textView, !(charSequence == null || charSequence.length() == 0));
    }

    public final void setText(CharSequence charSequence) {
        TextView textView = this.e;
        textView.setText(charSequence);
        bwt0.p0(textView, !(charSequence == null || charSequence.length() == 0));
    }

    public final void setTitle(String str) {
        TextView textView = this.d;
        textView.setText(str);
        bwt0.p0(textView, !(str == null || str.length() == 0));
    }
}
