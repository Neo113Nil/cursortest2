package gatewayprotocol.v1;

import gatewayprotocol.v1.DynamicDeviceInfoKt;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: DynamicDeviceInfoKt.kt */
/* loaded from: classes8.dex */
public final class DynamicDeviceInfoKtKt {
    /* renamed from: -initializedynamicDeviceInfo, reason: not valid java name */
    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo m235initializedynamicDeviceInfo(izs<? super DynamicDeviceInfoKt.Dsl, s3q0> izsVar) {
        DynamicDeviceInfoKt.Dsl _create = DynamicDeviceInfoKt.Dsl.Companion._create(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo copy(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo, izs<? super DynamicDeviceInfoKt.Dsl, s3q0> izsVar) {
        DynamicDeviceInfoKt.Dsl _create = DynamicDeviceInfoKt.Dsl.Companion._create(dynamicDeviceInfo.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android getAndroidOrNull(DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder dynamicDeviceInfoOrBuilder) {
        if (dynamicDeviceInfoOrBuilder.hasAndroid()) {
            return dynamicDeviceInfoOrBuilder.getAndroid();
        }
        return null;
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios getIosOrNull(DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder dynamicDeviceInfoOrBuilder) {
        if (dynamicDeviceInfoOrBuilder.hasIos()) {
            return dynamicDeviceInfoOrBuilder.getIos();
        }
        return null;
    }

    public static final NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports getNetworkCapabilityTransportsOrNull(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder androidOrBuilder) {
        if (androidOrBuilder.hasNetworkCapabilityTransports()) {
            return androidOrBuilder.getNetworkCapabilityTransports();
        }
        return null;
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Web getWebOrNull(DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder dynamicDeviceInfoOrBuilder) {
        if (dynamicDeviceInfoOrBuilder.hasWeb()) {
            return dynamicDeviceInfoOrBuilder.getWeb();
        }
        return null;
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android copy(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android android2, izs<? super DynamicDeviceInfoKt.AndroidKt.Dsl, s3q0> izsVar) {
        DynamicDeviceInfoKt.AndroidKt.Dsl _create = DynamicDeviceInfoKt.AndroidKt.Dsl.Companion._create(android2.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios copy(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios ios, izs<? super DynamicDeviceInfoKt.IosKt.Dsl, s3q0> izsVar) {
        DynamicDeviceInfoKt.IosKt.Dsl _create = DynamicDeviceInfoKt.IosKt.Dsl.Companion._create(ios.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Web copy(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Web web, izs<? super DynamicDeviceInfoKt.WebKt.Dsl, s3q0> izsVar) {
        DynamicDeviceInfoKt.WebKt.Dsl _create = DynamicDeviceInfoKt.WebKt.Dsl.Companion._create(web.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
