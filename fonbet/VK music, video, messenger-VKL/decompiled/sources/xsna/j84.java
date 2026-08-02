package xsna;

import android.content.Context;
import android.widget.LinearLayout;
import com.vk.writebar.attach.AttachmentsEditorView;

/* compiled from: AttachmentsEditorView.java */
/* loaded from: classes7.dex */
public final class j84 extends LinearLayout {
    public final /* synthetic */ AttachmentsEditorView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j84(AttachmentsEditorView attachmentsEditorView, Context context) {
        super(context);
        this.b = attachmentsEditorView;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3;
        AttachmentsEditorView attachmentsEditorView = this.b;
        return (attachmentsEditorView.m != null && i2 >= (i3 = attachmentsEditorView.n)) ? i2 == i + (-1) ? i3 : i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setChildrenDrawingOrderEnabled(true);
    }
}
