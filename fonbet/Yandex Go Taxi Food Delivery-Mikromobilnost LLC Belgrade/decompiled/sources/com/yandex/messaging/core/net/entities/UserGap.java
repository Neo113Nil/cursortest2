package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.text.SimpleDateFormat;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR&\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR$\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R&\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\u0003\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR&\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001c\u0010\b\"\u0004\b\u001d\u0010\nR$\u0010\u001e\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001f\u0010\u0003\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015¨\u0006#"}, d2 = {"Lcom/yandex/messaging/core/net/entities/UserGap;", "", "<init>", "()V", "workflow", "", "getWorkflow$annotations", "getWorkflow", "()Ljava/lang/String;", "setWorkflow", "(Ljava/lang/String;)V", "comment", "getComment$annotations", "getComment", "setComment", "workInAbsence", "", "getWorkInAbsence$annotations", "getWorkInAbsence", "()Z", "setWorkInAbsence", "(Z)V", "dateFrom", "getDateFrom$annotations", "getDateFrom", "setDateFrom", "dateTo", "getDateTo$annotations", "getDateTo", "setDateTo", "fullDay", "getFullDay$annotations", "getFullDay", "setFullDay", "Companion", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UserGap {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final SimpleDateFormat USER_GAP_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    private String comment;
    private String dateFrom;
    private String dateTo;
    private boolean fullDay;
    private boolean workInAbsence;
    private String workflow;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/core/net/entities/UserGap$Companion;", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Json(name = "comment")
    public static /* synthetic */ void getComment$annotations() {
    }

    @Json(name = "date_from")
    public static /* synthetic */ void getDateFrom$annotations() {
    }

    @Json(name = "date_to")
    public static /* synthetic */ void getDateTo$annotations() {
    }

    @Json(name = "full_day")
    public static /* synthetic */ void getFullDay$annotations() {
    }

    @Json(name = "work_in_absence")
    public static /* synthetic */ void getWorkInAbsence$annotations() {
    }

    @Json(name = "workflow")
    public static /* synthetic */ void getWorkflow$annotations() {
    }

    public final String getComment() {
        return this.comment;
    }

    public final String getDateFrom() {
        return this.dateFrom;
    }

    public final String getDateTo() {
        return this.dateTo;
    }

    public final boolean getFullDay() {
        return this.fullDay;
    }

    public final boolean getWorkInAbsence() {
        return this.workInAbsence;
    }

    public final String getWorkflow() {
        return this.workflow;
    }

    public final void setComment(String str) {
        this.comment = str;
    }

    public final void setDateFrom(String str) {
        this.dateFrom = str;
    }

    public final void setDateTo(String str) {
        this.dateTo = str;
    }

    public final void setFullDay(boolean z) {
        this.fullDay = z;
    }

    public final void setWorkInAbsence(boolean z) {
        this.workInAbsence = z;
    }

    public final void setWorkflow(String str) {
        this.workflow = str;
    }
}
