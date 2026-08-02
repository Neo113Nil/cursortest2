package xsna;

import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.userstack.VkUserStack;
import com.vk.imageloader.ImageScreenSize;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: LiveLikesDelegate.kt */
/* loaded from: classes3.dex */
public final class qjz extends p1u0<rjz> {
    public static final int f = iah0.a(8);
    public static final int g = iah0.a(16);
    public final ImageScreenSize a;
    public final int b;
    public final int c;
    public final int d;
    public final gzs<s3q0> e;

    public qjz(int i, int i2, int i3, ImageScreenSize imageScreenSize, gzs gzsVar) {
        this.a = imageScreenSize;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = gzsVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends rjz> b(ViewGroup viewGroup) {
        ConstraintLayout constraintLayout = new ConstraintLayout(viewGroup.getContext());
        constraintLayout.setLayoutParams(new RecyclerView.p(-1, -2));
        constraintLayout.setId(R.id.likes);
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        constraintLayout.setPadding(i3, i, i3, i2);
        constraintLayout.setClickable(true);
        jjc.g(constraintLayout, new sop(this, 21));
        VkUserStack vkUserStack = new VkUserStack(viewGroup.getContext(), null, 6);
        vkUserStack.setLayoutParams(new ConstraintLayout.b(-2, this.a.h()));
        vkUserStack.setId(R.id.avatar_box);
        constraintLayout.addView(vkUserStack);
        Context context = viewGroup.getContext();
        VkText vkText = new VkText(context, null, 6, 0);
        vkText.setLayoutParams(new ConstraintLayout.b(0, -1));
        vkText.setId(R.id.tv_likes);
        vkText.setTextAppearance(R.style.VkUiTypography_Footnote);
        e3m.a aVar = e3m.a;
        vkText.setTextColor(context.getColor(R.color.vk_gray_500));
        vkText.setTextSize(13.0f);
        constraintLayout.addView(vkText);
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.i(constraintLayout);
        bVar.k(R.id.avatar_box, 6, 0, 6);
        bVar.k(R.id.avatar_box, 3, 0, 3);
        bVar.k(R.id.avatar_box, 4, 0, 4);
        bVar.l(R.id.avatar_box, 7, R.id.tv_likes, 6, f);
        bVar.k(R.id.tv_likes, 6, R.id.avatar_box, 7);
        bVar.k(R.id.tv_likes, 3, R.id.avatar_box, 3);
        bVar.k(R.id.tv_likes, 4, R.id.avatar_box, 4);
        bVar.k(R.id.tv_likes, 7, 0, 7);
        bVar.b(constraintLayout);
        return new sjz(constraintLayout);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof rjz;
    }
}
