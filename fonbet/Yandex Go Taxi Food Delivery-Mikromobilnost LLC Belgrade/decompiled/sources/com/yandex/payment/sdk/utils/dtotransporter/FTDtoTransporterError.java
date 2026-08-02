package com.yandex.payment.sdk.utils.dtotransporter;

import com.yandex.div.state.db.StateEntry;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/payment/sdk/utils/dtotransporter/FTDtoTransporterError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "JasonPathNotFound", "ValueNodeNotFound", "ValueNodeIsNotMap", "ValueNodeIsNotArray", "Lcom/yandex/payment/sdk/utils/dtotransporter/FTDtoTransporterError$JasonPathNotFound;", "Lcom/yandex/payment/sdk/utils/dtotransporter/FTDtoTransporterError$ValueNodeIsNotArray;", "Lcom/yandex/payment/sdk/utils/dtotransporter/FTDtoTransporterError$ValueNodeIsNotMap;", "Lcom/yandex/payment/sdk/utils/dtotransporter/FTDtoTransporterError$ValueNodeNotFound;", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class FTDtoTransporterError extends Exception {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/payment/sdk/utils/dtotransporter/FTDtoTransporterError$JasonPathNotFound;", "Lcom/yandex/payment/sdk/utils/dtotransporter/FTDtoTransporterError;", "", StateEntry.COLUMN_PATH, "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JasonPathNotFound extends FTDtoTransporterError {
        private final String path;

        public JasonPathNotFound(String str) {
            this.path = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof JasonPathNotFound) && jl40.l(this.path, ((JasonPathNotFound) obj).path);
        }

        public final int hashCode() {
            return this.path.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return oyr.p("JasonPathNotFound(path=", this.path, Extension.C_BRAKE);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/payment/sdk/utils/dtotransporter/FTDtoTransporterError$ValueNodeIsNotArray;", "Lcom/yandex/payment/sdk/utils/dtotransporter/FTDtoTransporterError;", "", StateEntry.COLUMN_PATH, "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ValueNodeIsNotArray extends FTDtoTransporterError {
        private final String path;

        public ValueNodeIsNotArray(String str) {
            this.path = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ValueNodeIsNotArray) && jl40.l(this.path, ((ValueNodeIsNotArray) obj).path);
        }

        public final int hashCode() {
            return this.path.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return oyr.p("ValueNodeIsNotArray(path=", this.path, Extension.C_BRAKE);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/payment/sdk/utils/dtotransporter/FTDtoTransporterError$ValueNodeIsNotMap;", "Lcom/yandex/payment/sdk/utils/dtotransporter/FTDtoTransporterError;", "", StateEntry.COLUMN_PATH, "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ValueNodeIsNotMap extends FTDtoTransporterError {
        private final String path;

        public ValueNodeIsNotMap(String str) {
            this.path = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ValueNodeIsNotMap) && jl40.l(this.path, ((ValueNodeIsNotMap) obj).path);
        }

        public final int hashCode() {
            return this.path.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return oyr.p("ValueNodeIsNotMap(path=", this.path, Extension.C_BRAKE);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/payment/sdk/utils/dtotransporter/FTDtoTransporterError$ValueNodeNotFound;", "Lcom/yandex/payment/sdk/utils/dtotransporter/FTDtoTransporterError;", "", StateEntry.COLUMN_PATH, "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ValueNodeNotFound extends FTDtoTransporterError {
        private final String path;

        public ValueNodeNotFound(String str) {
            this.path = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ValueNodeNotFound) && jl40.l(this.path, ((ValueNodeNotFound) obj).path);
        }

        public final int hashCode() {
            return this.path.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return oyr.p("ValueNodeNotFound(path=", this.path, Extension.C_BRAKE);
        }
    }
}
