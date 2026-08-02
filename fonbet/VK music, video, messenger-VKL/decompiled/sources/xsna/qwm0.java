package xsna;

import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetImageBlockDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseSubscribeTileForegroundDto;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.superapp.ui.uniwidgets.WidgetObjects;
import com.vk.superapp.ui.widgets.tile.ImageWithAction;
import com.vk.superapp.ui.widgets.tile.TileBottomContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SubscribeTileMapper.kt */
/* loaded from: classes6.dex */
public final class qwm0 {
    public final WidgetObjects a;

    public qwm0(WidgetObjects widgetObjects) {
        this.a = widgetObjects;
    }

    public final ArrayList a(List list) {
        TileBottomContent tileBottomContent;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SuperAppShowcaseSubscribeTileForegroundDto superAppShowcaseSubscribeTileForegroundDto = (SuperAppShowcaseSubscribeTileForegroundDto) it.next();
                if (superAppShowcaseSubscribeTileForegroundDto instanceof SuperAppShowcaseSubscribeTileForegroundDto.SuperAppShowcaseTileForegroundTextDto) {
                    SuperAppShowcaseSubscribeTileForegroundDto.SuperAppShowcaseTileForegroundTextDto superAppShowcaseTileForegroundTextDto = (SuperAppShowcaseSubscribeTileForegroundDto.SuperAppShowcaseTileForegroundTextDto) superAppShowcaseSubscribeTileForegroundDto;
                    tileBottomContent = new TileBottomContent(superAppShowcaseTileForegroundTextDto.d() == SuperAppShowcaseSubscribeTileForegroundDto.SuperAppShowcaseTileForegroundTextDto.StyleDto.PRIMARY ? TileBottomContent.BottomContentType.TITLE : TileBottomContent.BottomContentType.SUBTITLE, superAppShowcaseTileForegroundTextDto.e(), null, null, false, false, 60, null);
                } else {
                    if (!(superAppShowcaseSubscribeTileForegroundDto instanceof SuperAppShowcaseSubscribeTileForegroundDto.SuperAppShowcaseTileForegroundUserStackDto)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TileBottomContent.BottomContentType bottomContentType = TileBottomContent.BottomContentType.USER_STACK;
                    SuperAppShowcaseSubscribeTileForegroundDto.SuperAppShowcaseTileForegroundUserStackDto superAppShowcaseTileForegroundUserStackDto = (SuperAppShowcaseSubscribeTileForegroundDto.SuperAppShowcaseTileForegroundUserStackDto) superAppShowcaseSubscribeTileForegroundDto;
                    String e = superAppShowcaseTileForegroundUserStackDto.e();
                    if (e == null) {
                        e = "";
                    }
                    String str = e;
                    List<SuperAppUniversalWidgetImageBlockDto> d = superAppShowcaseTileForegroundUserStackDto.d();
                    ArrayList arrayList2 = new ArrayList();
                    for (SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto : d) {
                        WebImage k = ks20.k(superAppUniversalWidgetImageBlockDto, this.a);
                        ImageWithAction imageWithAction = k != null ? new ImageWithAction(k, ks20.a(superAppUniversalWidgetImageBlockDto)) : null;
                        if (imageWithAction != null) {
                            arrayList2.add(imageWithAction);
                        }
                    }
                    tileBottomContent = new TileBottomContent(bottomContentType, str, arrayList2, null, false, false, 56, null);
                }
                arrayList.add(tileBottomContent);
            }
        }
        return arrayList;
    }
}
