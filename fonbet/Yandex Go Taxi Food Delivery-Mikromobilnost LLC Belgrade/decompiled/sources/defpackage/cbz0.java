package defpackage;

import com.yandex.delivery.mapper.model.TimelineItemStatus;
import java.util.ArrayList;
import java.util.List;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.ColorDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionShareDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.timeline.ActionOpenDetailsTimelineDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.timeline.BubbleDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.timeline.HorizontalTimelineItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.timeline.TimelineBubbleActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.timeline.TimelineBubbleButtonDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.timeline.TimelineDetailsShareButtonActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.timeline.TimelineDetailsShareButtonDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.timeline.TimelineDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.timeline.VerticalTimelineItemDto;

/* loaded from: classes14.dex */
public abstract class cbz0 {
    public static final v9z0 a(BubbleDto bubbleDto) {
        r9z0 r9z0Var;
        qfc qfcVar;
        String str;
        aqb1 aqb1Var;
        yaz0 yaz0Var;
        cqb1 cqb1Var;
        String str2;
        qfc qfcVar2;
        qfc qfcVar3;
        String leadIconTag = bubbleDto.getLeadIconTag();
        String title = bubbleDto.getTitle();
        TimelineBubbleButtonDto button = bubbleDto.getButton();
        if (button != null) {
            String title2 = button.getTitle();
            String textColor = button.getTextColor();
            String backgroundColor = button.getBackgroundColor();
            TimelineBubbleActionDto action = button.getAction();
            if (action instanceof TimelineBubbleActionDto.TimelineBubbleAction_DetailTimelineDto) {
                ActionOpenDetailsTimelineDto actionOpenDetailsTimelineDto = ((TimelineBubbleActionDto.TimelineBubbleAction_DetailTimelineDto) action).b;
                String title3 = actionOpenDetailsTimelineDto.getTitle();
                BubbleDto bubble = actionOpenDetailsTimelineDto.getBubble();
                v9z0 a = bubble != null ? a(bubble) : null;
                List<VerticalTimelineItemDto> vertical = actionOpenDetailsTimelineDto.getVertical();
                ArrayList arrayList = new ArrayList(tcc.n(vertical, 10));
                for (VerticalTimelineItemDto verticalTimelineItemDto : vertical) {
                    String leadTitle = verticalTimelineItemDto.getLeadTitle();
                    String leadSubtitle = verticalTimelineItemDto.getLeadSubtitle();
                    int i = bbz0.a[verticalTimelineItemDto.getStatus().ordinal()];
                    TimelineItemStatus timelineItemStatus = i != 1 ? i != 2 ? TimelineItemStatus.UNKNOWN : TimelineItemStatus.PASSED : TimelineItemStatus.PENDING;
                    String iconTag = verticalTimelineItemDto.getIconTag();
                    String title4 = verticalTimelineItemDto.getTitle();
                    ColorDto titleColor = verticalTimelineItemDto.getTitleColor();
                    if (titleColor != null) {
                        String colorDay = titleColor.getColorDay();
                        String colorNight = titleColor.getColorNight();
                        Double alphaDay = titleColor.getAlphaDay();
                        str2 = title2;
                        Float valueOf = alphaDay != null ? Float.valueOf((float) alphaDay.doubleValue()) : null;
                        Double alphaNight = titleColor.getAlphaNight();
                        qfcVar2 = new qfc(colorDay, colorNight, null, valueOf, alphaNight != null ? Float.valueOf((float) alphaNight.doubleValue()) : null);
                    } else {
                        str2 = title2;
                        qfcVar2 = null;
                    }
                    String subtitle = verticalTimelineItemDto.getSubtitle();
                    ColorDto subtitleColor = verticalTimelineItemDto.getSubtitleColor();
                    if (subtitleColor != null) {
                        String colorDay2 = subtitleColor.getColorDay();
                        String colorNight2 = subtitleColor.getColorNight();
                        Double alphaDay2 = subtitleColor.getAlphaDay();
                        Float valueOf2 = alphaDay2 != null ? Float.valueOf((float) alphaDay2.doubleValue()) : null;
                        Double alphaNight2 = subtitleColor.getAlphaNight();
                        qfcVar3 = new qfc(colorDay2, colorNight2, null, valueOf2, alphaNight2 != null ? Float.valueOf((float) alphaNight2.doubleValue()) : null);
                    } else {
                        qfcVar3 = null;
                    }
                    arrayList.add(new gj31(leadTitle, leadSubtitle, timelineItemStatus, iconTag, title4, qfcVar2, subtitle, qfcVar3));
                    title2 = str2;
                }
                str = title2;
                raz0 raz0Var = new raz0(actionOpenDetailsTimelineDto.getDoneButton().getText());
                TimelineDetailsShareButtonDto shareButton = actionOpenDetailsTimelineDto.getShareButton();
                if (shareButton != null) {
                    String text = shareButton.getText();
                    TimelineDetailsShareButtonActionDto action2 = shareButton.getAction();
                    if (action2 == null) {
                        cqb1Var = null;
                    } else if (action2 instanceof TimelineDetailsShareButtonActionDto.TimelineDetailsShareButtonAction_ShareDto) {
                        ActionShareDto actionShareDto = ((TimelineDetailsShareButtonActionDto.TimelineDetailsShareButtonAction_ShareDto) action2).b;
                        cqb1Var = new taz0(actionShareDto.getTitle(), actionShareDto.getSharingUrl());
                    } else if (action2 instanceof TimelineDetailsShareButtonActionDto.Unknown_TimelineDetailsShareButtonActionDto) {
                        cqb1Var = uaz0.a;
                    } else {
                        w511.b();
                        aqb1Var = null;
                        r9z0Var = new r9z0(str, textColor, backgroundColor, aqb1Var);
                    }
                    yaz0Var = new yaz0(text, cqb1Var);
                } else {
                    yaz0Var = null;
                }
                aqb1Var = new m9z0(title3, a, arrayList, raz0Var, yaz0Var);
                r9z0Var = new r9z0(str, textColor, backgroundColor, aqb1Var);
            } else {
                str = title2;
                if (action instanceof TimelineBubbleActionDto.Unknown_TimelineBubbleActionDto) {
                    aqb1Var = n9z0.a;
                    r9z0Var = new r9z0(str, textColor, backgroundColor, aqb1Var);
                } else {
                    w511.b();
                    aqb1Var = null;
                    r9z0Var = new r9z0(str, textColor, backgroundColor, aqb1Var);
                }
            }
        } else {
            r9z0Var = null;
        }
        ColorDto background = bubbleDto.getBackground();
        if (background != null) {
            String colorDay3 = background.getColorDay();
            String colorNight3 = background.getColorNight();
            Double alphaDay3 = background.getAlphaDay();
            Float valueOf3 = alphaDay3 != null ? Float.valueOf((float) alphaDay3.doubleValue()) : null;
            Double alphaNight3 = background.getAlphaNight();
            qfcVar = new qfc(colorDay3, colorNight3, null, valueOf3, alphaNight3 != null ? Float.valueOf((float) alphaNight3.doubleValue()) : null);
        } else {
            qfcVar = null;
        }
        return new v9z0(leadIconTag, title, r9z0Var, qfcVar);
    }

    public static final ncz0 b(TimelineDto timelineDto) {
        List<HorizontalTimelineItemDto> horizontal = timelineDto.getHorizontal();
        ArrayList arrayList = new ArrayList(tcc.n(horizontal, 10));
        for (HorizontalTimelineItemDto horizontalTimelineItemDto : horizontal) {
            String id = horizontalTimelineItemDto.getId();
            int i = bbz0.a[horizontalTimelineItemDto.getStatus().ordinal()];
            TimelineItemStatus timelineItemStatus = i != 1 ? i != 2 ? TimelineItemStatus.UNKNOWN : TimelineItemStatus.PASSED : TimelineItemStatus.PENDING;
            String imageTag = horizontalTimelineItemDto.getImageTag();
            String imageTagDark = horizontalTimelineItemDto.getImageTagDark();
            if (imageTagDark == null) {
                imageTagDark = "";
            }
            arrayList.add(new sru(id, timelineItemStatus, imageTag, imageTagDark));
        }
        String currentItemId = timelineDto.getCurrentItemId();
        BubbleDto bubble = timelineDto.getBubble();
        return new ncz0(arrayList, currentItemId, bubble != null ? a(bubble) : null);
    }
}
