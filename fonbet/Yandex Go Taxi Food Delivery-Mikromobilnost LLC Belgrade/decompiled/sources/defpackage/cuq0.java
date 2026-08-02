package defpackage;

import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.server.tooltips.api.data.ServerTooltipActionDto;
import com.ybsdk.feature.server.tooltips.api.data.ServerTooltipContentDto;
import com.ybsdk.feature.server.tooltips.api.data.ServerTooltipDto;
import com.ybsdk.feature.server.tooltips.api.data.ServerTooltipLinkContentDto;
import com.ybsdk.feature.server.tooltips.api.data.ServerTooltipModelDto;
import com.ybsdk.feature.server.tooltips.api.domain.ServerTooltipPositionEntity;

/* loaded from: classes3.dex */
public abstract class cuq0 {
    public static final auq0 a(ServerTooltipDto serverTooltipDto) {
        ServerTooltipPositionEntity serverTooltipPositionEntity;
        String name = serverTooltipDto.getName();
        String eventId = serverTooltipDto.getEventId();
        String defaultsGroup = serverTooltipDto.getDefaultsGroup();
        ServerTooltipModelDto model = serverTooltipDto.getModel();
        ytq0 ytq0Var = new ytq0(model.getAnchor().getViewId());
        int i = buq0.a[model.getPosition().ordinal()];
        xtq0 xtq0Var = null;
        duq0 duq0Var = null;
        if (i == 1) {
            serverTooltipPositionEntity = ServerTooltipPositionEntity.ABOVE;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            serverTooltipPositionEntity = ServerTooltipPositionEntity.BELOW;
        }
        ServerTooltipPositionEntity serverTooltipPositionEntity2 = serverTooltipPositionEntity;
        Integer durationMs = model.getDurationMs();
        ServerTooltipContentDto content = model.getContent();
        String title = content.getTitle();
        Text.Constant i2 = title != null ? g8e.i(Text.Companion, title) : null;
        String subtitle = content.getSubtitle();
        Text.Constant i3 = subtitle != null ? g8e.i(Text.Companion, subtitle) : null;
        ServerTooltipActionDto action = content.getAction();
        if (action != null) {
            ServerTooltipLinkContentDto linkContent = action.getLinkContent();
            if (linkContent != null) {
                Text.Constant i4 = g8e.i(Text.Companion, linkContent.getText());
                Themes<String> image = linkContent.getImage();
                duq0Var = new duq0(i4, image != null ? fob1.c(image.getLight(), image.getDark(), new hlq0(8)) : null);
            }
            xtq0Var = new xtq0(action.getUrl(), duq0Var);
        }
        return new auq0(name, eventId, defaultsGroup, new euq0(ytq0Var, serverTooltipPositionEntity2, new ztq0(i2, i3, xtq0Var), model.getVerticalMargin(), durationMs), serverTooltipDto.getShowingDelayMs());
    }
}
