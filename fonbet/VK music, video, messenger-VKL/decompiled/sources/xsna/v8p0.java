package xsna;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.photo.editor.features.filter.d;
import com.vkontakte.android.R;

/* compiled from: TopLevelFilterErrorHolder.kt */
/* loaded from: classes4.dex */
public final class v8p0 extends RecyclerView.e0 {
    public final d.c l;
    public final TextView m;
    public final View n;

    public v8p0(View view, d.c cVar) {
        super(view);
        this.l = cVar;
        this.m = (TextView) view.findViewById(R.id.filter_name);
        View findViewById = view.findViewById(R.id.retry_button);
        this.n = findViewById;
        findViewById.setOnClickListener(new q3(this, 15));
    }
}
