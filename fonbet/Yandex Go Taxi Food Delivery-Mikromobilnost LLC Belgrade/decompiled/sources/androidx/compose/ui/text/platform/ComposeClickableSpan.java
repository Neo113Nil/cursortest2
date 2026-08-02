package androidx.compose.ui.text.platform;

import android.text.style.ClickableSpan;
import android.view.View;
import defpackage.kky;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/platform/ComposeClickableSpan;", "Landroid/text/style/ClickableSpan;", "Lkky;", "link", "<init>", "(Lkky;)V", "Landroid/view/View;", "widget", "Lzy11;", "onClick", "(Landroid/view/View;)V", "Lkky;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class ComposeClickableSpan extends ClickableSpan {
    private final kky link;

    public ComposeClickableSpan(kky kkyVar) {
        this.link = kkyVar;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View widget) {
        this.link.a();
    }
}
