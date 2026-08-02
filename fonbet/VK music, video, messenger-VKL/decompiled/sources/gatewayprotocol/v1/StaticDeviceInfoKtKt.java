package gatewayprotocol.v1;

import gatewayprotocol.v1.StaticDeviceInfoKt;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: StaticDeviceInfoKt.kt */
/* loaded from: classes8.dex */
public final class StaticDeviceInfoKtKt {
    /* renamed from: -initializestaticDeviceInfo, reason: not valid java name */
    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo m272initializestaticDeviceInfo(izs<? super StaticDeviceInfoKt.Dsl, s3q0> izsVar) {
        StaticDeviceInfoKt.Dsl _create = StaticDeviceInfoKt.Dsl.Companion._create(StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo copy(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo, izs<? super StaticDeviceInfoKt.Dsl, s3q0> izsVar) {
        StaticDeviceInfoKt.Dsl _create = StaticDeviceInfoKt.Dsl.Companion._create(staticDeviceInfo.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android getAndroidOrNull(StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder staticDeviceInfoOrBuilder) {
        if (staticDeviceInfoOrBuilder.hasAndroid()) {
            return staticDeviceInfoOrBuilder.getAndroid();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios getIosOrNull(StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder staticDeviceInfoOrBuilder) {
        if (staticDeviceInfoOrBuilder.hasIos()) {
            return staticDeviceInfoOrBuilder.getIos();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo.Web getWebOrNull(StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder staticDeviceInfoOrBuilder) {
        if (staticDeviceInfoOrBuilder.hasWeb()) {
            return staticDeviceInfoOrBuilder.getWeb();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android copy(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android android2, izs<? super StaticDeviceInfoKt.AndroidKt.Dsl, s3q0> izsVar) {
        StaticDeviceInfoKt.AndroidKt.Dsl _create = StaticDeviceInfoKt.AndroidKt.Dsl.Companion._create(android2.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios copy(StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios ios, izs<? super StaticDeviceInfoKt.IosKt.Dsl, s3q0> izsVar) {
        StaticDeviceInfoKt.IosKt.Dsl _create = StaticDeviceInfoKt.IosKt.Dsl.Companion._create(ios.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo.Web copy(StaticDeviceInfoOuterClass.StaticDeviceInfo.Web web, izs<? super StaticDeviceInfoKt.WebKt.Dsl, s3q0> izsVar) {
        StaticDeviceInfoKt.WebKt.Dsl _create = StaticDeviceInfoKt.WebKt.Dsl.Companion._create(web.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
