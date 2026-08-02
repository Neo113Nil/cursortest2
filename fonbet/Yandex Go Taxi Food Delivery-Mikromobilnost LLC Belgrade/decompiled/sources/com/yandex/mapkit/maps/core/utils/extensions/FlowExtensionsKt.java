package com.yandex.mapkit.maps.core.utils.extensions;

import defpackage.bvf0;
import defpackage.c2r0;
import defpackage.hnr0;
import defpackage.ike;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.jxi;
import defpackage.kqr;
import defpackage.l8x;
import defpackage.lfx;
import defpackage.mvg;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.sls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.vpr;
import defpackage.wls;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.a;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.h;
import kotlinx.coroutines.flow.k;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001aC\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\u001e\u0010\u0006\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0005\"\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a1\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u0000\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a1\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u0000\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\r\u001a&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0006\b\u0000\u0010\u0004\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0003\u001a&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0006\b\u0000\u0010\u0004\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0086\b¢\u0006\u0004\b\u0010\u0010\u0003\u001a&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0006\b\u0000\u0010\u0004\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0086\b¢\u0006\u0004\b\u0011\u0010\u0003\u001a`\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u0012\"\n\b\u0001\u0010\u0013\u0018\u0001*\u00028\u0000\"\n\b\u0002\u0010\u0014\u0018\u0001*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00020\u0015H\u0086\b¢\u0006\u0004\b\u0018\u0010\u0019\u001az\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u0012\"\n\b\u0001\u0010\u0013\u0018\u0001*\u00028\u0000\"\n\b\u0002\u0010\u0014\u0018\u0001*\u00028\u0000\"\n\b\u0003\u0010\u001a\u0018\u0001*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00020\u00152\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00030\u0015H\u0086\b¢\u0006\u0004\b\u0018\u0010\u001c\u001a\u0094\u0001\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u0012\"\n\b\u0001\u0010\u0013\u0018\u0001*\u00028\u0000\"\n\b\u0002\u0010\u0014\u0018\u0001*\u00028\u0000\"\n\b\u0003\u0010\u001a\u0018\u0001*\u00028\u0000\"\n\b\u0004\u0010\u001d\u0018\u0001*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00020\u00152\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00030\u00152\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00040\u0015H\u0086\b¢\u0006\u0004\b\u0018\u0010\u001f\u001a®\u0001\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u0012\"\n\b\u0001\u0010\u0013\u0018\u0001*\u00028\u0000\"\n\b\u0002\u0010\u0014\u0018\u0001*\u00028\u0000\"\n\b\u0003\u0010\u001a\u0018\u0001*\u00028\u0000\"\n\b\u0004\u0010\u001d\u0018\u0001*\u00028\u0000\"\n\b\u0005\u0010 \u0018\u0001*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00020\u00152\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00030\u00152\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00040\u00152\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00050\u0015H\u0086\b¢\u0006\u0004\b\u0018\u0010\"\u001a#\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u0000\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b$\u0010\u0003\u001a%\u0010(\u001a\b\u0012\u0004\u0012\u00020%0\u00002\b\b\u0002\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%¢\u0006\u0004\b(\u0010)\u001a+\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010*\u001a\u00020%¢\u0006\u0004\b+\u0010,\u001a7\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000.0\u0000\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010-\u001a\u00028\u0000¢\u0006\u0004\b/\u00100\u001a1\u0010/\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u00000.0\u0000\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b/\u0010\u0003\u001a#\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b1\u0010\u0003\u001a?\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0014\b\u0004\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000002H\u0086\bø\u0001\u0000¢\u0006\u0004\b4\u00105\u001aG\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\"\u00109\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020807\u0012\u0006\u0012\u0004\u0018\u00010\u001206¢\u0006\u0004\b:\u0010;\u001a#\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000<\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b=\u0010>\u001a+\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000@\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010?\u001a\u00028\u0000¢\u0006\u0004\bA\u0010B\u001a#\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\bC\u0010\u0003\u001aY\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0000\u0010\u0004\"\b\b\u0001\u0010D*\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00002*\u0010F\u001a&\b\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000107\u0012\u0006\u0012\u0004\u0018\u00010\u00120E¢\u0006\u0004\bG\u0010H\u001a/\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010I\u001a\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\bJ\u0010K\u001a+\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bN\u0010,\u001a-\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010M\u001a\u00020LH\u0007¢\u0006\u0004\bP\u0010,\u001a+\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bR\u0010,\u001a*\u0010W\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010T\u001a\u00020LH\u0086H¢\u0006\u0004\bU\u0010V\u001aI\u0010\\\u001a\u00020[\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010Y\u001a\u00020X2\"\u0010Z\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020807\u0012\u0006\u0012\u0004\u0018\u00010\u001206¢\u0006\u0004\b\\\u0010]\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006^"}, d2 = {"Ltpr;", "", "not", "(Ltpr;)Ltpr;", "T", "", "others", "mergeWith", "(Ltpr;[Ltpr;)Ltpr;", "", "size", "", "slidingWindowNaive", "(Ltpr;I)Ltpr;", "chunked", "cast", "unsafeCast", "ofType", "", "A", "B", "Llfx;", "typeA", "typeB", "ofTypes", "(Ltpr;Llfx;Llfx;)Ltpr;", CA20Status.STATUS_REQUEST_C, "typeC", "(Ltpr;Llfx;Llfx;Llfx;)Ltpr;", CA20Status.STATUS_REQUEST_D, "typeD", "(Ltpr;Llfx;Llfx;Llfx;Llfx;)Ltpr;", "E", "typeE", "(Ltpr;Llfx;Llfx;Llfx;Llfx;Llfx;)Ltpr;", "", "skipAll", "", "initialDelayMillis", "periodMillis", "interval", "(JJ)Ltpr;", "intervalMillis", "emitFirstThenRepeatWithInterval", "(Ltpr;J)Ltpr;", "initial", "Lkotlin/Pair;", "zipWithNext", "(Ltpr;Ljava/lang/Object;)Ltpr;", "debounceByYield", "Lkotlin/Function0;", "block", "flatMapLatestIf", "(Ltpr;Lsls;)Ltpr;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Lzy11;", "action", "onEachLatest", "(Ltpr;Lwls;)Ltpr;", "Lhnr0;", "shareWhileSubscribed", "(Ltpr;)Lhnr0;", "initialValue", "Ln4u0;", "shareStateWhileSubscribed", "(Ltpr;Ljava/lang/Object;)Ln4u0;", "dropFirstNulls", "R", "Lkotlin/Function3;", "operation", "scanSeedless", "(Ltpr;Lzls;)Ltpr;", "other", "takeUntil", "(Ltpr;Ltpr;)Ltpr;", "Le3n;", "duration", "throttleLatest-HG0u8IE", "throttleLatest", "sampleLatest-HG0u8IE", "sampleLatest", "throttleFirst-HG0u8IE", "throttleFirst", "timeout", "firstWithTimeout-8Mi8wO0", "(Ltpr;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "firstWithTimeout", "Ltse;", "scope", "consumer", "Ll8x;", "collectIn", "(Ltpr;Ltse;Lwls;)Ll8x;", "exported-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FlowExtensionsKt {
    public static final <T> tpr cast(tpr tprVar) {
        jl40.P();
        throw null;
    }

    public static final <T> tpr chunked(tpr tprVar, int i) {
        return new rol0(new FlowExtensionsKt$chunked$1(i, tprVar, null));
    }

    public static final <T> l8x collectIn(tpr tprVar, tse tseVar, wls wlsVar) {
        return e.H(tseVar, new jqr(tprVar, wlsVar, 3));
    }

    public static final <T> tpr debounceByYield(tpr tprVar) {
        return e.X(tprVar, new FlowExtensionsKt$debounceByYield$1(null));
    }

    public static final <T> tpr dropFirstNulls(final tpr tprVar) {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        return new tpr() { // from class: com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$dropFirstNulls$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            /* renamed from: com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$dropFirstNulls$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements vpr {
                final /* synthetic */ Ref$BooleanRef $hadNotNulls$inlined;
                final /* synthetic */ vpr $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                @mvg(c = "com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$dropFirstNulls$$inlined$filter$1$2", f = "FlowExtensions.kt", l = {50}, m = "emit", v = 1)
                /* renamed from: com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$dropFirstNulls$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(vpr vprVar, Ref$BooleanRef ref$BooleanRef) {
                    this.$this_unsafeFlow = vprVar;
                    this.$hadNotNulls$inlined = ref$BooleanRef;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
                @Override // defpackage.vpr
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    boolean z;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                b.b(obj2);
                                vpr vprVar = this.$this_unsafeFlow;
                                Ref$BooleanRef ref$BooleanRef = this.$hadNotNulls$inlined;
                                if (obj != null) {
                                    ref$BooleanRef.element = true;
                                    z = true;
                                } else {
                                    z = ref$BooleanRef.element;
                                }
                                if (z) {
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.L$1 = null;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.I$0 = 0;
                                    anonymousClass1.label = 1;
                                    if (vprVar.emit(obj, anonymousClass1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                b.b(obj2);
                            }
                            return zy11.a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return zy11.a;
                }
            }

            @Override // defpackage.tpr
            public Object collect(vpr vprVar, Continuation continuation) {
                Object collect = tpr.this.collect(new AnonymousClass2(vprVar, ref$BooleanRef), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11.a;
            }
        };
    }

    public static final <T> tpr emitFirstThenRepeatWithInterval(tpr tprVar, long j) {
        return e.X(tprVar, new FlowExtensionsKt$emitFirstThenRepeatWithInterval$$inlined$flatMapLatest$1(null, j));
    }

    /* renamed from: firstWithTimeout-8Mi8wO0, reason: not valid java name */
    public static final <T> Object m215firstWithTimeout8Mi8wO0(tpr tprVar, long j, Continuation<? super T> continuation) {
        return a.x(j, new FlowExtensionsKt$firstWithTimeout$2(tprVar, null), continuation);
    }

    public static final <T> tpr flatMapLatestIf(tpr tprVar, sls slsVar) {
        return e.X(tprVar, new FlowExtensionsKt$flatMapLatestIf$$inlined$flatMapLatest$1(null, slsVar));
    }

    public static final tpr interval(long j, long j2) {
        return new rol0(new FlowExtensionsKt$interval$1(j, j2, null));
    }

    public static /* synthetic */ tpr interval$default(long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        return interval(j, j2);
    }

    public static final <T> tpr mergeWith(tpr tprVar, tpr... tprVarArr) {
        c2r0 c2r0Var = new c2r0(2, 1);
        c2r0Var.a(tprVar);
        c2r0Var.b(tprVarArr);
        ArrayList arrayList = c2r0Var.b;
        return e.E(new h(arrayList.toArray(new tpr[arrayList.size()])), kqr.a);
    }

    public static final tpr not(final tpr tprVar) {
        return new tpr() { // from class: com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$not$$inlined$map$1

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            /* renamed from: com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$not$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements vpr {
                final /* synthetic */ vpr $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                @mvg(c = "com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$not$$inlined$map$1$2", f = "FlowExtensions.kt", l = {50}, m = "emit", v = 1)
                /* renamed from: com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$not$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(vpr vprVar) {
                    this.$this_unsafeFlow = vprVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
                @Override // defpackage.vpr
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                b.b(obj2);
                                vpr vprVar = this.$this_unsafeFlow;
                                Boolean valueOf = Boolean.valueOf(!((Boolean) obj).booleanValue());
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                if (vprVar.emit(valueOf, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i != 1) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                b.b(obj2);
                            }
                            return zy11.a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return zy11.a;
                }
            }

            @Override // defpackage.tpr
            public Object collect(vpr vprVar, Continuation continuation) {
                Object collect = tpr.this.collect(new AnonymousClass2(vprVar), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11.a;
            }
        };
    }

    public static final <T> tpr ofType(tpr tprVar) {
        jl40.P();
        throw null;
    }

    public static final <T, A extends T, B extends T> tpr ofTypes(tpr tprVar, lfx lfxVar, lfx lfxVar2) {
        jl40.P();
        throw null;
    }

    public static final <T> tpr onEachLatest(tpr tprVar, wls wlsVar) {
        return e.X(tprVar, new FlowExtensionsKt$onEachLatest$1(wlsVar, null));
    }

    @jxi
    /* renamed from: sampleLatest-HG0u8IE, reason: not valid java name */
    public static final <T> tpr m217sampleLatestHG0u8IE(tpr tprVar, long j) {
        return e.i(new FlowExtensionsKt$sampleLatest$1(tprVar, j, null));
    }

    public static final <T, R> tpr scanSeedless(tpr tprVar, zls zlsVar) {
        return new rol0(new FlowExtensionsKt$scanSeedless$1(tprVar, zlsVar, null));
    }

    public static final <T> n4u0 shareStateWhileSubscribed(tpr tprVar, T t) {
        ike b = bvf0.b();
        return e.R(new k(tprVar, new FlowExtensionsKt$shareStateWhileSubscribed$1(b, null)), b, wsr0.a(xsr0.a, 3), t);
    }

    public static final <T> hnr0 shareWhileSubscribed(tpr tprVar) {
        ike b = bvf0.b();
        return e.O(new k(tprVar, new FlowExtensionsKt$shareWhileSubscribed$1(b, null)), b, wsr0.a(xsr0.a, 3), 1);
    }

    public static final <T> tpr skipAll(tpr tprVar) {
        return new rol0(new FlowExtensionsKt$skipAll$$inlined$transform$1(tprVar, null));
    }

    public static final <T> tpr slidingWindowNaive(tpr tprVar, int i) {
        return new rol0(new FlowExtensionsKt$slidingWindowNaive$1(tprVar, i, null));
    }

    public static final <T> tpr takeUntil(tpr tprVar, tpr tprVar2) {
        return new rol0(new FlowExtensionsKt$takeUntil$1(tprVar, tprVar2, null));
    }

    /* renamed from: throttleFirst-HG0u8IE, reason: not valid java name */
    public static final <T> tpr m218throttleFirstHG0u8IE(tpr tprVar, long j) {
        return new rol0(new FlowExtensionsKt$throttleFirst$1(j, tprVar, null));
    }

    /* renamed from: throttleLatest-HG0u8IE, reason: not valid java name */
    public static final <T> tpr m219throttleLatestHG0u8IE(tpr tprVar, long j) {
        return e.i(new FlowExtensionsKt$throttleLatest$1(tprVar, j, null));
    }

    public static final /* synthetic */ <T> tpr unsafeCast(tpr tprVar) {
        return tprVar;
    }

    public static final <T> tpr zipWithNext(tpr tprVar, T t) {
        return new rol0(new FlowExtensionsKt$zipWithNext$1(t, tprVar, null));
    }

    public static final <T, A extends T, B extends T, C extends T> tpr ofTypes(tpr tprVar, lfx lfxVar, lfx lfxVar2, lfx lfxVar3) {
        jl40.P();
        throw null;
    }

    public static final <T, A extends T, B extends T, C extends T, D extends T> tpr ofTypes(tpr tprVar, lfx lfxVar, lfx lfxVar2, lfx lfxVar3, lfx lfxVar4) {
        jl40.P();
        throw null;
    }

    public static final <T, A extends T, B extends T, C extends T, D extends T, E extends T> tpr ofTypes(tpr tprVar, lfx lfxVar, lfx lfxVar2, lfx lfxVar3, lfx lfxVar4, lfx lfxVar5) {
        jl40.P();
        throw null;
    }

    public static final <T> tpr zipWithNext(tpr tprVar) {
        return new rol0(new FlowExtensionsKt$zipWithNext$2(tprVar, null));
    }
}
