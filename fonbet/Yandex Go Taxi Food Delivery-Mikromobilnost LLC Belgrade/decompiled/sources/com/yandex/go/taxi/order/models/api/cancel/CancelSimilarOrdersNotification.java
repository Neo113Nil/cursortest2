package com.yandex.go.taxi.order.models.api.cancel;

import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ij7;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.unr0;
import defpackage.wh60;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/cancel/CancelSimilarOrdersNotification;", "Lwh60;", "Companion", "ModalType", "$serializer", "com/yandex/go/taxi/order/models/api/cancel/z", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CancelSimilarOrdersNotification implements wh60 {
    public static final z Companion = new z();
    public static final i3y[] g;
    public final String a;
    public final String b;
    public final List c;
    public final ModalType d;
    public final CancelSimilarOrdersModal e;
    public final OrderChangesDto.Notification f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/cancel/CancelSimilarOrdersNotification$ModalType;", "", "Companion", "com/yandex/go/taxi/order/models/api/cancel/a0", "ORDER_CARD", "IMAGE", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ModalType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ModalType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final a0 Companion;
        public static final ModalType IMAGE;
        public static final ModalType ORDER_CARD;

        static {
            ModalType modalType = new ModalType("ORDER_CARD", 0);
            ORDER_CARD = modalType;
            ModalType modalType2 = new ModalType("IMAGE", 1);
            IMAGE = modalType2;
            ModalType[] modalTypeArr = {modalType, modalType2};
            $VALUES = modalTypeArr;
            $ENTRIES = kotlin.enums.a.a(modalTypeArr);
            Companion = new a0();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ij7(13));
        }

        public static ModalType valueOf(String str) {
            return (ModalType) Enum.valueOf(ModalType.class, str);
        }

        public static ModalType[] values() {
            return (ModalType[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new ij7(11)), kotlin.a.b(lazyThreadSafetyMode, new ij7(12)), null, null};
    }

    public /* synthetic */ CancelSimilarOrdersNotification(int i, String str, String str2, List list, ModalType modalType, CancelSimilarOrdersModal cancelSimilarOrdersModal, OrderChangesDto.Notification notification) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = ModalType.ORDER_CARD;
        } else {
            this.d = modalType;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = cancelSimilarOrdersModal;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = notification;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancelSimilarOrdersNotification)) {
            return false;
        }
        CancelSimilarOrdersNotification cancelSimilarOrdersNotification = (CancelSimilarOrdersNotification) obj;
        return jl40.l(this.a, cancelSimilarOrdersNotification.a) && jl40.l(this.b, cancelSimilarOrdersNotification.b) && jl40.l(this.c, cancelSimilarOrdersNotification.c) && this.d == cancelSimilarOrdersNotification.d && jl40.l(this.e, cancelSimilarOrdersNotification.e) && jl40.l(this.f, cancelSimilarOrdersNotification.f);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + unr0.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        CancelSimilarOrdersModal cancelSimilarOrdersModal = this.e;
        int hashCode2 = (hashCode + (cancelSimilarOrdersModal == null ? 0 : cancelSimilarOrdersModal.hashCode())) * 31;
        OrderChangesDto.Notification notification = this.f;
        return hashCode2 + (notification != null ? notification.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("CancelSimilarOrdersNotification(id=", this.a, ", orderId=", this.b, ", orderIdsForCancel=");
        v.append(this.c);
        v.append(", modalType=");
        v.append(this.d);
        v.append(", modal=");
        v.append(this.e);
        v.append(", doneNotification=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public CancelSimilarOrdersNotification() {
        ModalType modalType = ModalType.ORDER_CARD;
        this.a = "";
        this.b = "";
        this.c = EmptyList.a;
        this.d = modalType;
        this.e = null;
        this.f = null;
    }
}
