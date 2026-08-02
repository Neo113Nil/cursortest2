package defpackage;

import android.graphics.Bitmap;
import com.yandex.go.image.api.domain.models.ImageSource;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes14.dex */
public final class in70 implements f16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ListItemComponent b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;

    public /* synthetic */ in70(ListItemComponent listItemComponent, int i, int i2, int i3, int i4) {
        this.a = i4;
        this.b = listItemComponent;
        this.c = i;
        this.w = i2;
        this.x = i3;
    }

    @Override // defpackage.f16
    public final void b(Bitmap bitmap, ebv ebvVar, ImageSource imageSource) {
        int i = this.a;
        int i2 = this.x;
        int i3 = this.w;
        int i4 = this.c;
        ListItemComponent listItemComponent = this.b;
        switch (i) {
            case 0:
                listItemComponent.setPaddingRelative(i4, listItemComponent.getPaddingTop(), listItemComponent.getPaddingEnd(), listItemComponent.getPaddingBottom());
                ListItemComponent.updateCenterFramePadding$default(listItemComponent, i3, 0, 2, null);
                c.D(i2, i2, listItemComponent.getLeadImageView());
                listItemComponent.setLeadImage(bitmap);
                break;
            default:
                listItemComponent.setPaddingRelative(listItemComponent.getPaddingStart(), listItemComponent.getPaddingTop(), i4, listItemComponent.getPaddingBottom());
                ListItemComponent.updateCenterFramePadding$default(listItemComponent, 0, i3, 1, null);
                c.D(i2, i2, listItemComponent.getTrailImageView());
                listItemComponent.setTrailImage(bitmap);
                break;
        }
    }

    @Override // defpackage.f16
    public final void onError(Throwable th) {
        int i = this.a;
        int i2 = this.c;
        ListItemComponent listItemComponent = this.b;
        switch (i) {
            case 0:
                listItemComponent.setPaddingRelative(0, listItemComponent.getPaddingTop(), listItemComponent.getPaddingEnd(), listItemComponent.getPaddingBottom());
                ListItemComponent.updateCenterFramePadding$default(listItemComponent, i2, 0, 2, null);
                listItemComponent.clearLeadView();
                break;
            default:
                listItemComponent.setPaddingRelative(listItemComponent.getPaddingStart(), listItemComponent.getPaddingTop(), 0, listItemComponent.getPaddingBottom());
                ListItemComponent.updateCenterFramePadding$default(listItemComponent, 0, i2, 1, null);
                listItemComponent.clearTrailView();
                break;
        }
    }
}
