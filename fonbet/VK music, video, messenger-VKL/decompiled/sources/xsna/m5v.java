package xsna;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.narratives.Narrative;
import com.vk.narratives.impl.highlights.AllHighlightsFragment;
import com.vkontakte.android.R;
import xsna.gu1;

/* compiled from: HighlightViewHolder.kt */
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes3.dex */
public final class m5v extends vif0<gu1.b> implements View.OnTouchListener {
    public final zt1 n;
    public final izs<RecyclerView.e0, s3q0> o;
    public final String p;
    public final j6v q;
    public final ComposeView r;

    public m5v(zt1 zt1Var, AllHighlightsFragment.a aVar, String str, j6v j6vVar, ComposeView composeView) {
        super(composeView);
        this.n = zt1Var;
        this.o = aVar;
        this.p = str;
        this.q = j6vVar;
        this.r = composeView;
    }

    @Override // xsna.vif0
    public final void i6(gu1.b bVar) {
        gu1.b bVar2 = bVar;
        String e = q6().l.isEmpty() ? y8g0.e(R.string.highlight_empty) : y8g0.c(R.plurals.highlights_stories_count, q6().l.size());
        String str = bVar2.b.d;
        ComposeView composeView = this.r;
        composeView.setContentDescription(str);
        composeView.setContent(new jai(-1365896325, new nn7(bVar2, this, e, 3), true));
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        this.o.invoke(this);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Narrative q6() {
        return ((gu1.b) this.m).b;
    }
}
