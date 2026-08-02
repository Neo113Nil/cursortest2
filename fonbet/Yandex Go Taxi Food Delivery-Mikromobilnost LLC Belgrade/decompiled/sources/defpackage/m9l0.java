package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import kotlin.Metadata;
import ru.yandex.taxi.search.address.view.PointType;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lm9l0;", "Ll050;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface m9l0 extends l050 {
    void animateVisibility(boolean z);

    void applyStyle(e430 e430Var);

    void close();

    void confirmRoute();

    void onPinRectForBubbleChanged(Rect rect, boolean z);

    void openPickupFromPhoto();

    void renderPickupFromPhotoButton(Bitmap bitmap, String str, String str2);

    void renderPickupFromPhotoTooltip(String str);

    void renderSourceDestination(hal0 hal0Var);

    void setBubbleText(CharSequence charSequence, boolean z);

    void setDoneButtonEnabled(boolean z);

    void setSaveButtonVisible(boolean z);

    void showAddressAdjustment();

    void showAnotherAddressPicker(PointType pointType);
}
