package defpackage;

import java.util.function.Consumer;
import ru.yandex.taxi.design.FloatingTitleToolbarComponent;

/* loaded from: classes9.dex */
public final /* synthetic */ class opr implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ FloatingTitleToolbarComponent b;

    public /* synthetic */ opr(FloatingTitleToolbarComponent floatingTitleToolbarComponent, int i) {
        this.a = i;
        this.b = floatingTitleToolbarComponent;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        FloatingTitleToolbarComponent floatingTitleToolbarComponent = this.b;
        int intValue = ((Integer) obj).intValue();
        switch (i) {
            case 0:
                floatingTitleToolbarComponent.setSubtitleColorAttr(intValue);
                break;
            case 1:
                floatingTitleToolbarComponent.setTitleColorAttr(intValue);
                break;
            case 2:
                FloatingTitleToolbarComponent.resolveAttrForToolbarTitleColor$lambda$1(floatingTitleToolbarComponent, intValue);
                break;
            case 3:
                floatingTitleToolbarComponent.setNavigationIconsColorAttr(intValue);
                break;
            case 4:
                FloatingTitleToolbarComponent.resolveAttrForToolbarNavigationColor$lambda$1(floatingTitleToolbarComponent, intValue);
                break;
            case 5:
                FloatingTitleToolbarComponent.resolveAttrForToolbarSubtitleColor$lambda$1(floatingTitleToolbarComponent, intValue);
                break;
            case 6:
                floatingTitleToolbarComponent.setExpandedToolbarBackgroundColorAttr(intValue);
                break;
            case 7:
                FloatingTitleToolbarComponent.resolveAttrForToolbarBackgroundExpanded$lambda$1(floatingTitleToolbarComponent, intValue);
                break;
            case 8:
                floatingTitleToolbarComponent.setCollapsedToolbarBackgroundColorAttr(intValue);
                break;
            case 9:
                FloatingTitleToolbarComponent.resolveAttrForToolbarBackgroundCollapsed$lambda$1(floatingTitleToolbarComponent, intValue);
                break;
            case 10:
                floatingTitleToolbarComponent.setTrailImageTintAttr(intValue);
                break;
            default:
                FloatingTitleToolbarComponent.resolveAttrForToolbarTrailClickableImageTint$lambda$1(floatingTitleToolbarComponent, intValue);
                break;
        }
    }
}
