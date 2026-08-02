package com.yandex.go.multimodal_route.analytics;

import com.yandex.messaging.core.net.entities.FoldersConfig;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"com/yandex/go/multimodal_route/analytics/MultimodalRouteAnalytics$MultimodalRouteButtonType", "", "Lcom/yandex/go/multimodal_route/analytics/MultimodalRouteAnalytics$MultimodalRouteButtonType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Back", "ModalOpen", "ModalClose", "EndOfModal", "ScheduleAndTickets", "MyTickets", "TaxiSectionDone", "Finish", "Done", "Close", "RatingTap", "CommentTap", "HintsTap", "Ready", "Swipe", "Support", "Tip", "ThreadVariants", "QrButton", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MultimodalRouteAnalytics$MultimodalRouteButtonType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MultimodalRouteAnalytics$MultimodalRouteButtonType[] $VALUES;
    public static final MultimodalRouteAnalytics$MultimodalRouteButtonType Back;
    public static final MultimodalRouteAnalytics$MultimodalRouteButtonType Close;
    public static final MultimodalRouteAnalytics$MultimodalRouteButtonType CommentTap;
    public static final MultimodalRouteAnalytics$MultimodalRouteButtonType Done;
    public static final MultimodalRouteAnalytics$MultimodalRouteButtonType EndOfModal;
    public static final MultimodalRouteAnalytics$MultimodalRouteButtonType Finish;
    public static final MultimodalRouteAnalytics$MultimodalRouteButtonType HintsTap;
    public static final MultimodalRouteAnalytics$MultimodalRouteButtonType ModalClose;
    public static final MultimodalRouteAnalytics$MultimodalRouteButtonType ModalOpen;
    public static final MultimodalRouteAnalytics$MultimodalRouteButtonType MyTickets;
    public static final MultimodalRouteAnalytics$MultimodalRouteButtonType QrButton;
    public static final MultimodalRouteAnalytics$MultimodalRouteButtonType RatingTap;
    public static final MultimodalRouteAnalytics$MultimodalRouteButtonType Ready;
    public static final MultimodalRouteAnalytics$MultimodalRouteButtonType ScheduleAndTickets;
    public static final MultimodalRouteAnalytics$MultimodalRouteButtonType Support;
    public static final MultimodalRouteAnalytics$MultimodalRouteButtonType Swipe;
    public static final MultimodalRouteAnalytics$MultimodalRouteButtonType TaxiSectionDone;
    public static final MultimodalRouteAnalytics$MultimodalRouteButtonType ThreadVariants;
    public static final MultimodalRouteAnalytics$MultimodalRouteButtonType Tip;
    private final String eventValue;

    static {
        MultimodalRouteAnalytics$MultimodalRouteButtonType multimodalRouteAnalytics$MultimodalRouteButtonType = new MultimodalRouteAnalytics$MultimodalRouteButtonType("Back", 0, "back");
        Back = multimodalRouteAnalytics$MultimodalRouteButtonType;
        MultimodalRouteAnalytics$MultimodalRouteButtonType multimodalRouteAnalytics$MultimodalRouteButtonType2 = new MultimodalRouteAnalytics$MultimodalRouteButtonType("ModalOpen", 1, "modal_open");
        ModalOpen = multimodalRouteAnalytics$MultimodalRouteButtonType2;
        MultimodalRouteAnalytics$MultimodalRouteButtonType multimodalRouteAnalytics$MultimodalRouteButtonType3 = new MultimodalRouteAnalytics$MultimodalRouteButtonType("ModalClose", 2, "modal_close");
        ModalClose = multimodalRouteAnalytics$MultimodalRouteButtonType3;
        MultimodalRouteAnalytics$MultimodalRouteButtonType multimodalRouteAnalytics$MultimodalRouteButtonType4 = new MultimodalRouteAnalytics$MultimodalRouteButtonType("EndOfModal", 3, "end_of_modal");
        EndOfModal = multimodalRouteAnalytics$MultimodalRouteButtonType4;
        MultimodalRouteAnalytics$MultimodalRouteButtonType multimodalRouteAnalytics$MultimodalRouteButtonType5 = new MultimodalRouteAnalytics$MultimodalRouteButtonType("ScheduleAndTickets", 4, "schedule_and_tickets");
        ScheduleAndTickets = multimodalRouteAnalytics$MultimodalRouteButtonType5;
        MultimodalRouteAnalytics$MultimodalRouteButtonType multimodalRouteAnalytics$MultimodalRouteButtonType6 = new MultimodalRouteAnalytics$MultimodalRouteButtonType("MyTickets", 5, "my_tickets");
        MyTickets = multimodalRouteAnalytics$MultimodalRouteButtonType6;
        MultimodalRouteAnalytics$MultimodalRouteButtonType multimodalRouteAnalytics$MultimodalRouteButtonType7 = new MultimodalRouteAnalytics$MultimodalRouteButtonType("TaxiSectionDone", 6, "taxi_section_done");
        TaxiSectionDone = multimodalRouteAnalytics$MultimodalRouteButtonType7;
        MultimodalRouteAnalytics$MultimodalRouteButtonType multimodalRouteAnalytics$MultimodalRouteButtonType8 = new MultimodalRouteAnalytics$MultimodalRouteButtonType("Finish", 7, "finish");
        Finish = multimodalRouteAnalytics$MultimodalRouteButtonType8;
        MultimodalRouteAnalytics$MultimodalRouteButtonType multimodalRouteAnalytics$MultimodalRouteButtonType9 = new MultimodalRouteAnalytics$MultimodalRouteButtonType("Done", 8, "done");
        Done = multimodalRouteAnalytics$MultimodalRouteButtonType9;
        MultimodalRouteAnalytics$MultimodalRouteButtonType multimodalRouteAnalytics$MultimodalRouteButtonType10 = new MultimodalRouteAnalytics$MultimodalRouteButtonType("Close", 9, "close");
        Close = multimodalRouteAnalytics$MultimodalRouteButtonType10;
        MultimodalRouteAnalytics$MultimodalRouteButtonType multimodalRouteAnalytics$MultimodalRouteButtonType11 = new MultimodalRouteAnalytics$MultimodalRouteButtonType("RatingTap", 10, "rating_tap");
        RatingTap = multimodalRouteAnalytics$MultimodalRouteButtonType11;
        MultimodalRouteAnalytics$MultimodalRouteButtonType multimodalRouteAnalytics$MultimodalRouteButtonType12 = new MultimodalRouteAnalytics$MultimodalRouteButtonType("CommentTap", 11, "comment_tap");
        CommentTap = multimodalRouteAnalytics$MultimodalRouteButtonType12;
        MultimodalRouteAnalytics$MultimodalRouteButtonType multimodalRouteAnalytics$MultimodalRouteButtonType13 = new MultimodalRouteAnalytics$MultimodalRouteButtonType("HintsTap", 12, "hints_tap");
        HintsTap = multimodalRouteAnalytics$MultimodalRouteButtonType13;
        MultimodalRouteAnalytics$MultimodalRouteButtonType multimodalRouteAnalytics$MultimodalRouteButtonType14 = new MultimodalRouteAnalytics$MultimodalRouteButtonType("Ready", 13, UgcLiveVideoData.UgcLiveStatus.READY);
        Ready = multimodalRouteAnalytics$MultimodalRouteButtonType14;
        MultimodalRouteAnalytics$MultimodalRouteButtonType multimodalRouteAnalytics$MultimodalRouteButtonType15 = new MultimodalRouteAnalytics$MultimodalRouteButtonType("Swipe", 14, "swipe");
        Swipe = multimodalRouteAnalytics$MultimodalRouteButtonType15;
        MultimodalRouteAnalytics$MultimodalRouteButtonType multimodalRouteAnalytics$MultimodalRouteButtonType16 = new MultimodalRouteAnalytics$MultimodalRouteButtonType("Support", 15, FoldersConfig.SUPPORT_FILTER_ID);
        Support = multimodalRouteAnalytics$MultimodalRouteButtonType16;
        MultimodalRouteAnalytics$MultimodalRouteButtonType multimodalRouteAnalytics$MultimodalRouteButtonType17 = new MultimodalRouteAnalytics$MultimodalRouteButtonType("Tip", 16, "tip");
        Tip = multimodalRouteAnalytics$MultimodalRouteButtonType17;
        MultimodalRouteAnalytics$MultimodalRouteButtonType multimodalRouteAnalytics$MultimodalRouteButtonType18 = new MultimodalRouteAnalytics$MultimodalRouteButtonType("ThreadVariants", 17, "thread_variants");
        ThreadVariants = multimodalRouteAnalytics$MultimodalRouteButtonType18;
        MultimodalRouteAnalytics$MultimodalRouteButtonType multimodalRouteAnalytics$MultimodalRouteButtonType19 = new MultimodalRouteAnalytics$MultimodalRouteButtonType("QrButton", 18, "qr_button");
        QrButton = multimodalRouteAnalytics$MultimodalRouteButtonType19;
        MultimodalRouteAnalytics$MultimodalRouteButtonType[] multimodalRouteAnalytics$MultimodalRouteButtonTypeArr = {multimodalRouteAnalytics$MultimodalRouteButtonType, multimodalRouteAnalytics$MultimodalRouteButtonType2, multimodalRouteAnalytics$MultimodalRouteButtonType3, multimodalRouteAnalytics$MultimodalRouteButtonType4, multimodalRouteAnalytics$MultimodalRouteButtonType5, multimodalRouteAnalytics$MultimodalRouteButtonType6, multimodalRouteAnalytics$MultimodalRouteButtonType7, multimodalRouteAnalytics$MultimodalRouteButtonType8, multimodalRouteAnalytics$MultimodalRouteButtonType9, multimodalRouteAnalytics$MultimodalRouteButtonType10, multimodalRouteAnalytics$MultimodalRouteButtonType11, multimodalRouteAnalytics$MultimodalRouteButtonType12, multimodalRouteAnalytics$MultimodalRouteButtonType13, multimodalRouteAnalytics$MultimodalRouteButtonType14, multimodalRouteAnalytics$MultimodalRouteButtonType15, multimodalRouteAnalytics$MultimodalRouteButtonType16, multimodalRouteAnalytics$MultimodalRouteButtonType17, multimodalRouteAnalytics$MultimodalRouteButtonType18, multimodalRouteAnalytics$MultimodalRouteButtonType19};
        $VALUES = multimodalRouteAnalytics$MultimodalRouteButtonTypeArr;
        $ENTRIES = a.a(multimodalRouteAnalytics$MultimodalRouteButtonTypeArr);
    }

    public MultimodalRouteAnalytics$MultimodalRouteButtonType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static MultimodalRouteAnalytics$MultimodalRouteButtonType valueOf(String str) {
        return (MultimodalRouteAnalytics$MultimodalRouteButtonType) Enum.valueOf(MultimodalRouteAnalytics$MultimodalRouteButtonType.class, str);
    }

    public static MultimodalRouteAnalytics$MultimodalRouteButtonType[] values() {
        return (MultimodalRouteAnalytics$MultimodalRouteButtonType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
