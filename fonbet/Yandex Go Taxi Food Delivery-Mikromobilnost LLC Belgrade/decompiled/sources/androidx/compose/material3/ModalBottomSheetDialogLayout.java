package androidx.compose.material3;

import android.content.Context;
import android.view.Window;
import androidx.compose.ui.platform.AbstractComposeView;
import defpackage.aii0;
import defpackage.bts;
import defpackage.fid;
import defpackage.gfj;
import defpackage.oz40;
import defpackage.p8d;
import defpackage.ttd;
import defpackage.vng;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R7\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u000e\u0010\u001aR$\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Landroidx/compose/material3/ModalBottomSheetDialogLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Lgfj;", "Landroid/content/Context;", "context", "Landroid/view/Window;", "window", "<init>", "(Landroid/content/Context;Landroid/view/Window;)V", "Lttd;", "parent", "Lkotlin/Function0;", "Lzy11;", "content", "setContent", "(Lttd;Lwls;)V", "Content", "(Lfid;I)V", "Landroid/view/Window;", "getWindow", "()Landroid/view/Window;", "<set-?>", "content$delegate", "Loz40;", "getContent", "()Lwls;", "(Lwls;)V", "", "value", "shouldCreateCompositionOnAttachedToWindow", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class ModalBottomSheetDialogLayout extends AbstractComposeView implements gfj {

    /* renamed from: content$delegate, reason: from kotlin metadata */
    private final oz40 content;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private final Window window;

    public ModalBottomSheetDialogLayout(Context context, Window window) {
        super(context, null, 0, 6, null);
        this.window = window;
        p8d.a.getClass();
        this.content = androidx.compose.runtime.f.j(p8d.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 Content$lambda$0(ModalBottomSheetDialogLayout modalBottomSheetDialogLayout, int i, fid fidVar, int i2) {
        modalBottomSheetDialogLayout.Content(fidVar, vng.O(i | 1));
        return zy11.a;
    }

    private final wls getContent() {
        return (wls) this.content.getValue();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(576708319);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            getContent().invoke(btsVar, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i(this, i, i3);
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // defpackage.gfj
    public Window getWindow() {
        return this.window;
    }

    public final void setContent(ttd parent, wls content) {
        setParentCompositionContext(parent);
        setContent(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
        createComposition();
    }

    private final void setContent(wls wlsVar) {
        this.content.setValue(wlsVar);
    }
}
