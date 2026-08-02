package xsna;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.dto.newsfeed.entries.Poster;

/* compiled from: PosterTextViews.kt */
/* loaded from: classes4.dex */
public class dbc0 extends AppCompatTextView {
    public final cbc0 b;

    public dbc0(Context context) {
        super(context);
        this.b = new cbc0(this);
    }

    public void setConstants(Poster.Constants constants) {
        this.b.d = constants;
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        this.b.e = i;
    }

    public void setWithMentionsParsing(boolean z) {
        this.b.getClass();
    }
}
