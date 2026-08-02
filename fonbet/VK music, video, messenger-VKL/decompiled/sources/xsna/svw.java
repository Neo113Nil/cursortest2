package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.components.picture.VkImage;
import com.vk.feed.core.models.ImagePhoto;
import com.vk.feed.core.models.info.InfoBlock;
import com.vk.feed.core.models.info.InfoPopup;
import com.vk.newsfeed.common.PostActions;
import com.vkontakte.android.R;

/* compiled from: InfoBlockHolder.kt */
/* loaded from: classes4.dex */
public final class svw extends qi6<InfoBlock> implements View.OnClickListener {
    public static final /* synthetic */ int I = 0;
    public final VkImage C;
    public final TextView D;
    public final TextView E;
    public final View F;
    public final int G;
    public final tvw H;

    public svw(ViewGroup viewGroup) {
        super(R.layout.news_info_block, viewGroup);
        this.C = (VkImage) this.itemView.findViewById(R.id.info_block_image);
        this.D = (TextView) this.itemView.findViewById(R.id.info_block_text);
        TextView textView = (TextView) this.itemView.findViewById(R.id.info_block_button);
        this.E = textView;
        View findViewById = this.itemView.findViewById(R.id.info_block_ignore);
        this.F = findViewById;
        this.G = this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.info_block_image_width);
        this.H = new tvw();
        textView.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        f4m.v(cn70.b(12), this.itemView);
    }

    @Override // xsna.qi6
    public final void E6(InfoBlock infoBlock) {
        boolean z;
        InfoBlock infoBlock2 = infoBlock;
        ImagePhoto imagePhoto = infoBlock2.i;
        String a = imagePhoto != null ? imagePhoto.a(this.G) : null;
        VkImage vkImage = this.C;
        if (a == null || a.length() == 0) {
            z = false;
        } else {
            vkImage.o0(a, null);
            z = true;
        }
        bwt0.p0(vkImage, z);
        xo9.A(this.D, infoBlock2.j);
        xo9.A(this.E, infoBlock2.k);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        s980 s980Var;
        if (jjc.b()) {
            return;
        }
        u1c0 J0 = J0();
        int i = J0 != null ? J0.k : 0;
        InfoBlock q6 = q6();
        if (q6 != null) {
            if (!epx.f(view, this.E)) {
                if (!epx.f(view, this.F) || (s980Var = this.y) == null) {
                    return;
                }
                s980Var.d9(q6, t6(), PostActions.ACTION_IGNORE.h(), i);
                return;
            }
            InfoPopup infoPopup = q6.l;
            if (infoPopup != null) {
                Context context = this.itemView.getContext();
                this.H.getClass();
                tvw.a(context, infoPopup);
            }
        }
    }
}
