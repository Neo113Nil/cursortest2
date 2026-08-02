package defpackage;

import ru.yandex.taxi.logistics.explicit_comment_courier.comment.ui.DeliveryExplicitCommentCourierView;

/* loaded from: classes5.dex */
public final class b9i implements p8i {
    public final /* synthetic */ DeliveryExplicitCommentCourierView a;

    public b9i(DeliveryExplicitCommentCourierView deliveryExplicitCommentCourierView) {
        this.a = deliveryExplicitCommentCourierView;
    }

    @Override // defpackage.p8i
    public final void close() {
        this.a.dismiss();
    }

    @Override // defpackage.p8i
    public final void requestFocus() {
        this.a.requestFocus();
    }
}
