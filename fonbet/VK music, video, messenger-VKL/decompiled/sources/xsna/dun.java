package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.wc6;

/* compiled from: DocumentHolder.java */
/* loaded from: classes7.dex */
public class dun<T extends wc6> extends vif0<T> implements UsableRecyclerView.e, UsableRecyclerView.r, View.OnClickListener {
    public final TextView n;
    public final TextView o;
    public final TextView p;
    public final VKImageView q;

    public dun(@NonNull Context context) {
        super(R.layout.documents_item, context);
        this.n = (TextView) this.itemView.findViewById(R.id.docs_item_title);
        this.o = (TextView) this.itemView.findViewById(R.id.docs_item_type);
        this.p = (TextView) this.itemView.findViewById(R.id.docs_item_info);
        this.q = (VKImageView) this.itemView.findViewById(R.id.docs_item_thumb);
    }

    public static String q6(float f) {
        StringBuilder sb = new StringBuilder();
        if (f == Math.round(f)) {
            f = (int) f;
        }
        return shy.c(f, "", sb);
    }

    public static String s6(long j, Resources resources) {
        if (j > 1073741824) {
            return q6(Math.round((j / 1.0737418E9f) * 100.0f) / 100.0f) + " " + resources.getString(R.string.fsize_gb);
        }
        if (j > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            return q6(Math.round((j / 1048576.0f) * 10.0f) / 10.0f) + " " + resources.getString(R.string.fsize_mb);
        }
        if (j > PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            return Math.round(j / 1024.0f) + " " + resources.getString(R.string.fsize_kb);
        }
        return j + " " + resources.getString(R.string.fsize_b);
    }

    @Override // me.grishka.appkit.views.UsableRecyclerView.r
    public final boolean P4() {
        return false;
    }

    public void onClick() {
    }

    @Override // xsna.vif0
    /* renamed from: t6, reason: merged with bridge method [inline-methods] */
    public void i6(T t) {
        this.n.setText(t.getTitle());
        this.o.setText(t.P7().toUpperCase().substring(0, Math.min(t.P7().length(), 4)));
        v6(this.p, t);
    }

    public void v6(TextView textView, T t) {
        textView.setText(s6(t.getSize(), b6()) + " · " + pvo0.i(false, t.D(), false, false));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        onClick();
    }
}
