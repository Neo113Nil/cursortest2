package xsna;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.dto.newsfeed.entries.Copyright;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import kotlin.Result;

/* compiled from: CopyrightHolder.kt */
/* loaded from: classes4.dex */
public final class ntj extends qi6<Post> implements View.OnClickListener {
    public static final int E = cn70.b(28);
    public final AppCompatTextView C;
    public final StringBuilder D;

    /* compiled from: CopyrightHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Copyright.Type.values().length];
            try {
                iArr[Copyright.Type.EXTERNAL_LINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ntj(ViewGroup viewGroup) {
        super(r0);
        AppCompatTextView appCompatTextView = new AppCompatTextView(viewGroup.getContext());
        appCompatTextView.setId(R.id.text);
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) this.itemView.findViewById(R.id.text);
        this.C = appCompatTextView2;
        this.D = new StringBuilder();
        ViewGroup.LayoutParams layoutParams = appCompatTextView2.getLayoutParams();
        int i = E;
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = i;
        } else {
            appCompatTextView2.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, i));
        }
        bwt0.V(appCompatTextView2, new tbg(this, 12));
        appCompatTextView2.setGravity(8388627);
        appCompatTextView2.setOnClickListener(this);
        int b = an10.b(appCompatTextView2.getResources().getDimension(R.dimen.post_side_padding));
        appCompatTextView2.setPadding(b, 0, b, 0);
        appCompatTextView2.setSingleLine();
        appCompatTextView2.setIncludeFontPadding(false);
        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
        jno0.c(appCompatTextView2, R.attr.vk_ui_text_secondary);
        com.vk.typography.b.k(appCompatTextView2, FontFamily.REGULAR, Float.valueOf(13.0f), 4);
    }

    @Override // xsna.qi6
    public final void E6(Post post) {
        Object failure;
        Copyright copyright = post.O;
        if (copyright == null) {
            return;
        }
        String str = copyright.b;
        Copyright.Type type = copyright.f;
        if (a.$EnumSwitchMapping$0[type.ordinal()] == 1) {
            try {
                failure = Uri.parse(str).getHost();
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            String str2 = (String) failure;
            if (str2 != null) {
                str = str2;
            }
        } else {
            str = copyright.d;
        }
        AppCompatTextView appCompatTextView = this.C;
        if (str == null || str.length() == 0 || !(type == Copyright.Type.OWNER || type == Copyright.Type.VK_APP || type == Copyright.Type.APP || type == Copyright.Type.EXTERNAL_LINK)) {
            bwt0.p0(appCompatTextView, false);
            return;
        }
        bwt0.p0(appCompatTextView, true);
        StringBuilder sb = this.D;
        sb.setLength(0);
        sb.append(v6(R.string.article_source));
        sb.append(' ');
        sb.append(str);
        appCompatTextView.setText(sb.toString());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Post q6;
        if (jjc.b() || (q6 = q6()) == null) {
            return;
        }
        new mtj().a(this.itemView.getContext(), q6);
    }
}
