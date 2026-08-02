package com.yandex.mobile.drive.sdk.full.model;

import com.yandex.mobile.drive.sdk.full.GeoPoint;
import defpackage.a0r0;
import defpackage.avu0;
import defpackage.b0r0;
import defpackage.c0r0;
import defpackage.d0r0;
import defpackage.e0r0;
import defpackage.eab1;
import defpackage.evu0;
import defpackage.f0r0;
import defpackage.g0r0;
import defpackage.h0r0;
import defpackage.i0r0;
import defpackage.jl40;
import defpackage.ysq0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/mobile/drive/sdk/full/model/RideSession;", "", "Lcom/yandex/mobile/drive/sdk/full/model/Segment;", "segment", "Lcom/yandex/mobile/drive/sdk/full/model/UiEntry;", "uiEntry", "<init>", "(Lcom/yandex/mobile/drive/sdk/full/model/Segment;Lcom/yandex/mobile/drive/sdk/full/model/UiEntry;)V", "Lcom/yandex/mobile/drive/sdk/full/model/Segment;", "d", "()Lcom/yandex/mobile/drive/sdk/full/model/Segment;", "Lcom/yandex/mobile/drive/sdk/full/model/UiEntry;", "e", "()Lcom/yandex/mobile/drive/sdk/full/model/UiEntry;", "drive_sdk_go_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class RideSession {

    @ysq0("segment")
    private final Segment segment;

    @ysq0("ui_entry")
    private final UiEntry uiEntry;

    public RideSession(Segment segment, UiEntry uiEntry) {
        this.segment = segment;
        this.uiEntry = uiEntry;
    }

    public static ArrayList f(String str) {
        List W;
        ArrayList arrayList;
        W = evu0.W(str, new String[]{" "}, (r2 & 4) != 0 ? 0 : 2);
        int size = W.size() / 2;
        if (size < 1) {
            return new ArrayList();
        }
        arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            int i2 = i * 2;
            Double i3 = avu0.i((String) W.get(i2));
            Double i4 = avu0.i((String) W.get(i2 + 1));
            if (i3 != null && i4 != null) {
                arrayList.add(new GeoPoint(i4.doubleValue(), i3.doubleValue()));
            }
        }
        return arrayList;
    }

    public final Long a() {
        SegmentSession session;
        SessionSpecials specials;
        Double free_time;
        Segment segment = this.segment;
        if (segment == null || (session = segment.getSession()) == null || (specials = session.getSpecials()) == null || (free_time = specials.getFree_time()) == null) {
            return null;
        }
        return Long.valueOf((long) free_time.doubleValue());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        if (r0.equals("old_state_acceptance_paid") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
    
        if (r0.equals("old_state_reservation_paid") == false) goto L55;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final eab1 b() {
        Meta meta;
        SegmentSession session;
        Long a = a();
        long longValue = a != null ? a.longValue() : 0L;
        Segment segment = this.segment;
        String current_performing = (segment == null || (session = segment.getSession()) == null) ? null : session.getCurrent_performing();
        if (current_performing != null) {
            switch (current_performing.hashCode()) {
                case -2061730245:
                    if (current_performing.equals("old_state_riding")) {
                        return g0r0.a;
                    }
                    break;
                case -1671097591:
                    if (current_performing.equals("transformation")) {
                        return h0r0.a;
                    }
                    break;
                case -1606003235:
                    if (current_performing.equals("old_state_acceptance")) {
                        if (longValue > 0) {
                            return a0r0.a;
                        }
                        return c0r0.a;
                    }
                    break;
                case -1480184334:
                    if (current_performing.equals("old_state_parking")) {
                        return e0r0.a;
                    }
                    break;
                case -1331184027:
                    break;
                case -439938810:
                    if (current_performing.equals("old_state_reservation")) {
                        if (longValue > 0) {
                            return f0r0.a;
                        }
                        return d0r0.a;
                    }
                    break;
                case 636807150:
                    break;
            }
        }
        Segment segment2 = this.segment;
        return !((segment2 == null || (meta = segment2.getMeta()) == null) ? false : jl40.l(meta.getFinished(), Boolean.FALSE)) ? b0r0.a : i0r0.a;
    }

    public final CurrentOffer c() {
        SegmentSession session;
        SessionSpecials specials;
        Segment segment = this.segment;
        if (segment == null || (session = segment.getSession()) == null || (specials = session.getSpecials()) == null) {
            return null;
        }
        return specials.getCurrent_offer();
    }

    /* renamed from: d, reason: from getter */
    public final Segment getSegment() {
        return this.segment;
    }

    /* renamed from: e, reason: from getter */
    public final UiEntry getUiEntry() {
        return this.uiEntry;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideSession)) {
            return false;
        }
        RideSession rideSession = (RideSession) obj;
        return jl40.l(this.segment, rideSession.segment) && jl40.l(this.uiEntry, rideSession.uiEntry);
    }

    public final int hashCode() {
        Segment segment = this.segment;
        int hashCode = (segment == null ? 0 : segment.hashCode()) * 31;
        UiEntry uiEntry = this.uiEntry;
        return hashCode + (uiEntry != null ? uiEntry.hashCode() : 0);
    }

    public final String toString() {
        return "RideSession(segment=" + this.segment + ", uiEntry=" + this.uiEntry + Extension.C_BRAKE;
    }
}
