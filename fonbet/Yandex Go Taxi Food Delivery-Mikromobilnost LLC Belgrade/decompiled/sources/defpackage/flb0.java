package defpackage;

import ru.yandex.taxi.logistics.sdk.photocomments.PhotocommentsView;

/* loaded from: classes5.dex */
public final /* synthetic */ class flb0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotocommentsView b;

    public /* synthetic */ flb0(PhotocommentsView photocommentsView, int i) {
        this.a = i;
        this.b = photocommentsView;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 _init_$lambda$0;
        zy11 lambda$0$0;
        zy11 lambda$0$0$0;
        int i = this.a;
        PhotocommentsView photocommentsView = this.b;
        fid fidVar = (fid) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                _init_$lambda$0 = PhotocommentsView._init_$lambda$0(photocommentsView, fidVar, intValue);
                return _init_$lambda$0;
            case 1:
                lambda$0$0 = PhotocommentsView.lambda$0$0(photocommentsView, fidVar, intValue);
                return lambda$0$0;
            default:
                lambda$0$0$0 = PhotocommentsView.lambda$0$0$0(photocommentsView, fidVar, intValue);
                return lambda$0$0$0;
        }
    }
}
