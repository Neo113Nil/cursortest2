package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.d;
import com.vk.common.links.AwayLink;
import com.vk.common.links.LaunchContext;
import com.vk.dto.attachments.Merchant;
import com.vk.dto.attachments.Product;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Price;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import com.vkontakte.android.data.PostInteract;
import java.util.ArrayList;

/* compiled from: CompactSnippetHolder.kt */
/* loaded from: classes4.dex */
public final class f6i extends ikg<SnippetAttachment> implements View.OnLongClickListener {
    public final StringBuilder L;

    /* compiled from: CompactSnippetHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Merchant.values().length];
            try {
                iArr[Merchant.ALIEXPRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public f6i(ViewGroup viewGroup) {
        super(viewGroup);
        this.L = new StringBuilder();
        VKImageView vKImageView = this.D;
        qcy<Object>[] qcyVarArr = bwt0.a;
        dhr0.f0(R.drawable.white_oval, R.attr.vk_ui_background_secondary, vKImageView);
        this.itemView.setOnLongClickListener(this);
    }

    @Override // xsna.m56
    public final void T6(Attachment attachment) {
        int i;
        SnippetAttachment snippetAttachment = (SnippetAttachment) attachment;
        this.E.setText(snippetAttachment.g);
        Product product = snippetAttachment.r;
        TextView textView = this.F;
        if (product != null) {
            Price price = product.b;
            StringBuilder sb = this.L;
            sb.setLength(0);
            if (price.e.length() > 0) {
                sb.append(price.e);
            }
            String str = a.$EnumSwitchMapping$0[product.d.ordinal()] == 1 ? "AliExpress" : null;
            if (str != null && str.length() != 0) {
                if (sb.length() > 0) {
                    sb.append(" · ");
                }
                sb.append(str);
            }
            textView.setText(sb);
            i = R.drawable.vk_icon_market_24;
        } else {
            textView.setText(Uri.parse(snippetAttachment.f.b).getAuthority());
            i = R.drawable.vk_icon_link_24;
        }
        omw.d(this.D, i, R.attr.vk_ui_icon_medium);
    }

    public final void Y6(SnippetAttachment snippetAttachment) {
        PostInteract postInteract = this.w;
        if (postInteract != null) {
            postInteract.f = snippetAttachment.f.b;
            postInteract.Cb(PostInteract.Type.snippet_action);
        }
        LaunchContext launchContext = new LaunchContext(false, false, false, null, null, null, null, this.v, snippetAttachment.f.b, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108479);
        gd60 a2 = hd60.a();
        Context context = this.itemView.getContext();
        AwayLink awayLink = snippetAttachment.f;
        a2.V(context, awayLink.b, snippetAttachment.j, awayLink.c, launchContext);
    }

    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        Parcelable q6 = q6();
        c6z c6zVar = q6 instanceof c6z ? (c6z) q6 : null;
        SnippetAttachment snippetAttachment = (SnippetAttachment) this.C;
        if (snippetAttachment == null) {
            return;
        }
        if (snippetAttachment.q != null) {
            hd60.a().q0(this.itemView.getContext(), snippetAttachment.Jb(), (r15 & 4) != 0 ? null : snippetAttachment, (r15 & 8) != 0 ? null : null, c6zVar != null ? c6zVar.r() : null, false);
        } else {
            Y6(snippetAttachment);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        SnippetAttachment snippetAttachment;
        if (jjc.b() || (snippetAttachment = (SnippetAttachment) this.C) == null) {
            return false;
        }
        Context context = this.itemView.getContext();
        String str = snippetAttachment.f.b;
        cg1 cg1Var = new cg1(11, this, snippetAttachment);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(context.getString(R.string.vk_open));
        arrayList2.add("open");
        arrayList.add(context.getString(R.string.vk_copy));
        arrayList2.add("copy");
        new d.a(context).setTitle(str).b((CharSequence[]) arrayList.toArray(new String[0]), new ebz(arrayList2, cg1Var, context, str)).m();
        return true;
    }
}
