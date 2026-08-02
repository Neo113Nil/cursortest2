package com.yandex.passport.data.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.acx;
import defpackage.auu0;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.k8u;
import defpackage.oyr;
import defpackage.p53;
import defpackage.pnz;
import defpackage.psq0;
import defpackage.qje;
import defpackage.qv10;
import defpackage.sbx;
import defpackage.tje;
import defpackage.unr0;
import defpackage.xvz;
import defpackage.yjd;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@gsq0
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b[\b\u0087\b\u0018\u0000 Ú\u00012\u00020\u0001:\u0004Û\u0001Ü\u0001B\u009f\u0003\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u000f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u000f\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u000f\u0012\u0006\u0010 \u001a\u00020\u000f\u0012\u0006\u0010!\u001a\u00020\u000f\u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\"\u0012\u0006\u0010$\u001a\u00020\u000f\u0012\u0006\u0010%\u001a\u00020\u000f\u0012\u0006\u0010&\u001a\u00020\u000f\u0012\u0006\u0010'\u001a\u00020\u000f\u0012\u0006\u0010(\u001a\u00020\u000f\u0012\u0006\u0010)\u001a\u00020\u000f\u0012\u0006\u0010*\u001a\u00020\u000f\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0005\u0012\u001a\u0010.\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070-\u0018\u00010,\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u00100\u001a\u00020\u000f\u0012\u0006\u00101\u001a\u00020\u000f\u0012\u0006\u00102\u001a\u00020\u000f\u0012\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b5\u00106Bé\u0003\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010:\u001a\u000209\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000f\u0012\b\b\u0002\u0010 \u001a\u00020\u000f\u0012\b\b\u0002\u0010!\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\"\u0012\b\b\u0002\u0010$\u001a\u00020\u000f\u0012\b\b\u0002\u0010%\u001a\u00020\u000f\u0012\b\b\u0002\u0010&\u001a\u00020\u000f\u0012\b\b\u0002\u0010'\u001a\u00020\u000f\u0012\b\b\u0002\u0010(\u001a\u00020\u000f\u0012\b\b\u0002\u0010)\u001a\u00020\u000f\u0012\b\b\u0002\u0010*\u001a\u00020\u000f\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0005\u0012\u001a\b\u0002\u0010.\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070-0,\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u00100\u001a\u00020\u000f\u0012\b\b\u0002\u00101\u001a\u00020\u000f\u0012\b\b\u0002\u00102\u001a\u00020\u000f¢\u0006\u0004\b5\u0010;J\u001d\u0010@\u001a\u00020?2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020\u0002¢\u0006\u0004\b@\u0010AJ\r\u0010B\u001a\u00020\u0002¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bF\u0010EJ\u0010\u0010I\u001a\u000209HÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0010\u0010J\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bJ\u0010HJ\u0010\u0010K\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\bK\u0010EJ\u0012\u0010L\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bL\u0010EJ\u0012\u0010M\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bM\u0010EJ\u0012\u0010N\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bN\u0010EJ\u0010\u0010O\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bO\u0010CJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bP\u0010EJ\u0012\u0010Q\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bQ\u0010EJ\u0010\u0010R\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0012\u0010T\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bT\u0010EJ\u0010\u0010U\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\bU\u0010SJ\u0012\u0010V\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bV\u0010EJ\u0010\u0010W\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\bW\u0010SJ\u0010\u0010X\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\bX\u0010SJ\u0010\u0010Y\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\bY\u0010SJ\u0012\u0010Z\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bZ\u0010EJ\u0012\u0010[\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b[\u0010EJ\u0012\u0010\\\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\\\u0010EJ\u0010\u0010]\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b]\u0010CJ\u0012\u0010^\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b^\u0010EJ\u0012\u0010_\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b_\u0010EJ\u0010\u0010`\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b`\u0010SJ\u0012\u0010a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\ba\u0010EJ\u0010\u0010b\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\bb\u0010SJ\u0010\u0010c\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\bc\u0010SJ\u0010\u0010d\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\bd\u0010SJ\u0016\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00070\"HÆ\u0003¢\u0006\u0004\be\u0010fJ\u0010\u0010g\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\bg\u0010SJ\u0010\u0010h\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\bh\u0010SJ\u0010\u0010i\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\bi\u0010SJ\u0010\u0010j\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\bj\u0010SJ\u0010\u0010k\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\bk\u0010SJ\u0010\u0010l\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\bl\u0010SJ\u0010\u0010m\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\bm\u0010SJ\u0012\u0010n\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bn\u0010oJ\"\u0010p\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070-0,HÆ\u0003¢\u0006\u0004\bp\u0010qJ\u0012\u0010r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\br\u0010oJ\u0010\u0010s\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\bs\u0010SJ\u0010\u0010t\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\bt\u0010SJ\u0010\u0010u\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\bu\u0010SJø\u0003\u0010x\u001a\u00020\u00002\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010:\u001a\u0002092\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u000f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010 \u001a\u00020\u000f2\b\b\u0002\u0010!\u001a\u00020\u000f2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\"2\b\b\u0002\u0010$\u001a\u00020\u000f2\b\b\u0002\u0010%\u001a\u00020\u000f2\b\b\u0002\u0010&\u001a\u00020\u000f2\b\b\u0002\u0010'\u001a\u00020\u000f2\b\b\u0002\u0010(\u001a\u00020\u000f2\b\b\u0002\u0010)\u001a\u00020\u000f2\b\b\u0002\u0010*\u001a\u00020\u000f2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00052\u001a\b\u0002\u0010.\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070-0,2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u00100\u001a\u00020\u000f2\b\b\u0002\u00101\u001a\u00020\u000f2\b\b\u0002\u00102\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\bv\u0010wJ\u0010\u0010y\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\by\u0010EJ\u0010\u0010z\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bz\u0010CJ\u001a\u0010}\u001a\u00020\u000f2\b\u0010|\u001a\u0004\u0018\u00010{HÖ\u0003¢\u0006\u0004\b}\u0010~J.\u0010\u0086\u0001\u001a\u00020?2\u0006\u0010\u007f\u001a\u00020\u00002\b\u0010\u0081\u0001\u001a\u00030\u0080\u00012\b\u0010\u0083\u0001\u001a\u00030\u0082\u0001H\u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001R&\u00107\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b7\u0010\u0087\u0001\u0012\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0005\b\u0088\u0001\u0010ER&\u00108\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b8\u0010\u0087\u0001\u0012\u0006\b\u008c\u0001\u0010\u008a\u0001\u001a\u0005\b\u008b\u0001\u0010ER$\u0010:\u001a\u0002098\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b:\u0010\u008d\u0001\u0012\u0006\b\u008f\u0001\u0010\u008a\u0001\u001a\u0005\b\u008e\u0001\u0010HR$\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0006\u0010\u008d\u0001\u0012\u0006\b\u0091\u0001\u0010\u008a\u0001\u001a\u0005\b\u0090\u0001\u0010HR$\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\b\u0010\u0087\u0001\u0012\u0006\b\u0093\u0001\u0010\u008a\u0001\u001a\u0005\b\u0092\u0001\u0010ER&\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\t\u0010\u0087\u0001\u0012\u0006\b\u0095\u0001\u0010\u008a\u0001\u001a\u0005\b\u0094\u0001\u0010ER&\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\n\u0010\u0087\u0001\u0012\u0006\b\u0097\u0001\u0010\u008a\u0001\u001a\u0005\b\u0096\u0001\u0010ER&\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u000b\u0010\u0087\u0001\u0012\u0006\b\u0099\u0001\u0010\u008a\u0001\u001a\u0005\b\u0098\u0001\u0010ER$\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\f\u0010\u009a\u0001\u0012\u0006\b\u009c\u0001\u0010\u008a\u0001\u001a\u0005\b\u009b\u0001\u0010CR&\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\r\u0010\u0087\u0001\u0012\u0006\b\u009e\u0001\u0010\u008a\u0001\u001a\u0005\b\u009d\u0001\u0010ER&\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u000e\u0010\u0087\u0001\u0012\u0006\b \u0001\u0010\u008a\u0001\u001a\u0005\b\u009f\u0001\u0010ER#\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0010\u0010¡\u0001\u0012\u0006\b¢\u0001\u0010\u008a\u0001\u001a\u0004\b\u0010\u0010SR&\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0011\u0010\u0087\u0001\u0012\u0006\b¤\u0001\u0010\u008a\u0001\u001a\u0005\b£\u0001\u0010ER$\u0010\u0012\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0012\u0010¡\u0001\u0012\u0006\b¦\u0001\u0010\u008a\u0001\u001a\u0005\b¥\u0001\u0010SR&\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0013\u0010\u0087\u0001\u0012\u0006\b¨\u0001\u0010\u008a\u0001\u001a\u0005\b§\u0001\u0010ER#\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0014\u0010¡\u0001\u0012\u0006\b©\u0001\u0010\u008a\u0001\u001a\u0004\b\u0014\u0010SR$\u0010\u0015\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0015\u0010¡\u0001\u0012\u0006\b«\u0001\u0010\u008a\u0001\u001a\u0005\bª\u0001\u0010SR$\u0010\u0016\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0016\u0010¡\u0001\u0012\u0006\b\u00ad\u0001\u0010\u008a\u0001\u001a\u0005\b¬\u0001\u0010SR&\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0017\u0010\u0087\u0001\u0012\u0006\b¯\u0001\u0010\u008a\u0001\u001a\u0005\b®\u0001\u0010ER&\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0018\u0010\u0087\u0001\u0012\u0006\b±\u0001\u0010\u008a\u0001\u001a\u0005\b°\u0001\u0010ER&\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0019\u0010\u0087\u0001\u0012\u0006\b³\u0001\u0010\u008a\u0001\u001a\u0005\b²\u0001\u0010ER$\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001a\u0010\u009a\u0001\u0012\u0006\bµ\u0001\u0010\u008a\u0001\u001a\u0005\b´\u0001\u0010CR&\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001b\u0010\u0087\u0001\u0012\u0006\b·\u0001\u0010\u008a\u0001\u001a\u0005\b¶\u0001\u0010ER&\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001c\u0010\u0087\u0001\u0012\u0006\b¹\u0001\u0010\u008a\u0001\u001a\u0005\b¸\u0001\u0010ER#\u0010\u001d\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u001d\u0010¡\u0001\u0012\u0006\bº\u0001\u0010\u008a\u0001\u001a\u0004\b\u001d\u0010SR&\u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001e\u0010\u0087\u0001\u0012\u0006\b¼\u0001\u0010\u008a\u0001\u001a\u0005\b»\u0001\u0010ER#\u0010\u001f\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u001f\u0010¡\u0001\u0012\u0006\b½\u0001\u0010\u008a\u0001\u001a\u0004\b\u001f\u0010SR#\u0010 \u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b \u0010¡\u0001\u0012\u0006\b¾\u0001\u0010\u008a\u0001\u001a\u0004\b \u0010SR#\u0010!\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b!\u0010¡\u0001\u0012\u0006\b¿\u0001\u0010\u008a\u0001\u001a\u0004\b!\u0010SR*\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\"8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b#\u0010À\u0001\u0012\u0006\bÂ\u0001\u0010\u008a\u0001\u001a\u0005\bÁ\u0001\u0010fR#\u0010$\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b$\u0010¡\u0001\u0012\u0006\bÃ\u0001\u0010\u008a\u0001\u001a\u0004\b$\u0010SR#\u0010%\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b%\u0010¡\u0001\u0012\u0006\bÄ\u0001\u0010\u008a\u0001\u001a\u0004\b%\u0010SR$\u0010&\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b&\u0010¡\u0001\u0012\u0006\bÆ\u0001\u0010\u008a\u0001\u001a\u0005\bÅ\u0001\u0010SR$\u0010'\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b'\u0010¡\u0001\u0012\u0006\bÈ\u0001\u0010\u008a\u0001\u001a\u0005\bÇ\u0001\u0010SR$\u0010(\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b(\u0010¡\u0001\u0012\u0006\bÊ\u0001\u0010\u008a\u0001\u001a\u0005\bÉ\u0001\u0010SR#\u0010)\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b)\u0010¡\u0001\u0012\u0006\bË\u0001\u0010\u008a\u0001\u001a\u0004\b)\u0010SR#\u0010*\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b*\u0010¡\u0001\u0012\u0006\bÌ\u0001\u0010\u008a\u0001\u001a\u0004\b*\u0010SR&\u0010+\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b+\u0010Í\u0001\u0012\u0006\bÏ\u0001\u0010\u008a\u0001\u001a\u0005\bÎ\u0001\u0010oR6\u0010.\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070-0,8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b.\u0010Ð\u0001\u0012\u0006\bÒ\u0001\u0010\u008a\u0001\u001a\u0005\bÑ\u0001\u0010qR&\u0010/\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b/\u0010Í\u0001\u0012\u0006\bÔ\u0001\u0010\u008a\u0001\u001a\u0005\bÓ\u0001\u0010oR$\u00100\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b0\u0010¡\u0001\u0012\u0006\bÖ\u0001\u0010\u008a\u0001\u001a\u0005\bÕ\u0001\u0010SR#\u00101\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b1\u0010¡\u0001\u0012\u0006\b×\u0001\u0010\u008a\u0001\u001a\u0004\b1\u0010SR$\u00102\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b2\u0010¡\u0001\u0012\u0006\bÙ\u0001\u0010\u008a\u0001\u001a\u0005\bØ\u0001\u0010S¨\u0006Ý\u0001"}, d2 = {"Lcom/yandex/passport/data/models/UserInfoData;", "Landroid/os/Parcelable;", "", "seen0", "seen1", "", "uidValue", "", "displayName", "publicName", "securePhoneNumber", "normalizedDisplayLogin", "primaryAliasType", "nativeDefaultEmail", "avatarUrl", "", "isAvatarEmpty", "socialProviderCode", "hasPassword", "yandexoidLogin", "isBetaTester", "hasPlus", "hasMusicSubscription", "firstName", "lastName", "birthday", "xTokenIssuedAt", "displayLogin", "publicId", "isChild", "machineReadableLogin", "is2faEnabled", "isSms2faEnabled", "isRfc2faEnabled", "", "partitions", "isPictureLoginForbidden", "isXtokenTrusted", "hasPlusCard", "hasProCard", "hasFamily", "isDriveUser", "isTaxiCompanyBound", "locationId", "", "", "filterParameters", "muidValue", "hasMasterToken", "isBrowserAccount", "hasWebAuthNCredential", "Lpsq0;", "serializationConstructorMarker", "<init>", "(IIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZLjava/util/List;ZZZZZZZLjava/lang/Long;Ljava/util/Map;Ljava/lang/Long;ZZZLpsq0;)V", "body", "eTag", "Lcom/yandex/passport/common/time/a;", "retrievalTime", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZLjava/util/List;ZZZZZZZLjava/lang/Long;Ljava/util/Map;Ljava/lang/Long;ZZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3-R7zlAxo", "()J", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "()Z", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "()Ljava/util/List;", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "()Ljava/lang/Long;", "component39", "()Ljava/util/Map;", "component40", "component41", "component42", "component43", "copy-wiADLzA", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZLjava/util/List;ZZZZZZZLjava/lang/Long;Ljava/util/Map;Ljava/lang/Long;ZZZ)Lcom/yandex/passport/data/models/UserInfoData;", "copy", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$passport_data_release", "(Lcom/yandex/passport/data/models/UserInfoData;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getBody", "getBody$annotations", "()V", "getETag", "getETag$annotations", "J", "getRetrievalTime-R7zlAxo", "getRetrievalTime-R7zlAxo$annotations", "getUidValue", "getUidValue$annotations", "getDisplayName", "getDisplayName$annotations", "getPublicName", "getPublicName$annotations", "getSecurePhoneNumber", "getSecurePhoneNumber$annotations", "getNormalizedDisplayLogin", "getNormalizedDisplayLogin$annotations", CA20Status.STATUS_USER_I, "getPrimaryAliasType", "getPrimaryAliasType$annotations", "getNativeDefaultEmail", "getNativeDefaultEmail$annotations", "getAvatarUrl", "getAvatarUrl$annotations", "Z", "isAvatarEmpty$annotations", "getSocialProviderCode", "getSocialProviderCode$annotations", "getHasPassword", "getHasPassword$annotations", "getYandexoidLogin", "getYandexoidLogin$annotations", "isBetaTester$annotations", "getHasPlus", "getHasPlus$annotations", "getHasMusicSubscription", "getHasMusicSubscription$annotations", "getFirstName", "getFirstName$annotations", "getLastName", "getLastName$annotations", "getBirthday", "getBirthday$annotations", "getXTokenIssuedAt", "getXTokenIssuedAt$annotations", "getDisplayLogin", "getDisplayLogin$annotations", "getPublicId", "getPublicId$annotations", "isChild$annotations", "getMachineReadableLogin", "getMachineReadableLogin$annotations", "is2faEnabled$annotations", "isSms2faEnabled$annotations", "isRfc2faEnabled$annotations", "Ljava/util/List;", "getPartitions", "getPartitions$annotations", "isPictureLoginForbidden$annotations", "isXtokenTrusted$annotations", "getHasPlusCard", "getHasPlusCard$annotations", "getHasProCard", "getHasProCard$annotations", "getHasFamily", "getHasFamily$annotations", "isDriveUser$annotations", "isTaxiCompanyBound$annotations", "Ljava/lang/Long;", "getLocationId", "getLocationId$annotations", "Ljava/util/Map;", "getFilterParameters", "getFilterParameters$annotations", "getMuidValue", "getMuidValue$annotations", "getHasMasterToken", "getHasMasterToken$annotations", "isBrowserAccount$annotations", "getHasWebAuthNCredential", "getHasWebAuthNCredential$annotations", "Companion", "com/yandex/passport/data/models/t", "com/yandex/passport/data/models/s", "passport-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class UserInfoData implements Parcelable {
    private static final KSerializer[] $childSerializers;

    /* renamed from: json, reason: collision with root package name */
    private static final sbx f100json;
    private final String avatarUrl;
    private final String birthday;
    private final String body;
    private final String displayLogin;
    private final String displayName;
    private final String eTag;
    private final Map<String, Set<String>> filterParameters;
    private final String firstName;
    private final boolean hasFamily;
    private final boolean hasMasterToken;
    private final boolean hasMusicSubscription;
    private final boolean hasPassword;
    private final boolean hasPlus;
    private final boolean hasPlusCard;
    private final boolean hasProCard;
    private final boolean hasWebAuthNCredential;
    private final boolean is2faEnabled;
    private final boolean isAvatarEmpty;
    private final boolean isBetaTester;
    private final boolean isBrowserAccount;
    private final boolean isChild;
    private final boolean isDriveUser;
    private final boolean isPictureLoginForbidden;
    private final boolean isRfc2faEnabled;
    private final boolean isSms2faEnabled;
    private final boolean isTaxiCompanyBound;
    private final boolean isXtokenTrusted;
    private final String lastName;
    private final Long locationId;
    private final String machineReadableLogin;
    private final Long muidValue;
    private final String nativeDefaultEmail;
    private final String normalizedDisplayLogin;
    private final List<String> partitions;
    private final int primaryAliasType;
    private final String publicId;
    private final String publicName;
    private final long retrievalTime;
    private final String securePhoneNumber;
    private final String socialProviderCode;
    private final long uidValue;
    private final int xTokenIssuedAt;
    private final String yandexoidLogin;
    public static final t Companion = new t();
    public static final Parcelable.Creator<UserInfoData> CREATOR = new Creator();

    static {
        auu0 auu0Var = auu0.a;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new p53(auu0Var, 0), null, null, null, null, null, null, null, null, new k8u(auu0Var, new p53(auu0Var, 1), 1), null, null, null, null};
        f100json = tje.a(sbx.d, new com.yandex.passport.common.network.t(1));
    }

    public /* synthetic */ UserInfoData(int i, int i2, long j, String str, String str2, String str3, String str4, int i3, String str5, String str6, boolean z, String str7, boolean z2, String str8, boolean z3, boolean z4, boolean z5, String str9, String str10, String str11, int i4, String str12, String str13, boolean z6, String str14, boolean z7, boolean z8, boolean z9, List list, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, Long l, Map map, Long l2, boolean z17, boolean z18, boolean z19, psq0 psq0Var) {
        if (35 != (i & 35)) {
            qje.Y(new int[]{i, i2}, new int[]{35, 0}, s.a.getDescriptor());
            throw null;
        }
        this.body = null;
        this.eTag = null;
        this.retrievalTime = 0L;
        this.uidValue = j;
        this.displayName = str;
        if ((i & 4) == 0) {
            this.publicName = null;
        } else {
            this.publicName = str2;
        }
        if ((i & 8) == 0) {
            this.securePhoneNumber = null;
        } else {
            this.securePhoneNumber = str3;
        }
        if ((i & 16) == 0) {
            this.normalizedDisplayLogin = null;
        } else {
            this.normalizedDisplayLogin = str4;
        }
        this.primaryAliasType = i3;
        if ((i & 64) == 0) {
            this.nativeDefaultEmail = null;
        } else {
            this.nativeDefaultEmail = str5;
        }
        if ((i & 128) == 0) {
            this.avatarUrl = null;
        } else {
            this.avatarUrl = str6;
        }
        if ((i & 256) == 0) {
            this.isAvatarEmpty = false;
        } else {
            this.isAvatarEmpty = z;
        }
        if ((i & 512) == 0) {
            this.socialProviderCode = null;
        } else {
            this.socialProviderCode = str7;
        }
        if ((i & 1024) == 0) {
            this.hasPassword = false;
        } else {
            this.hasPassword = z2;
        }
        if ((i & 2048) == 0) {
            this.yandexoidLogin = null;
        } else {
            this.yandexoidLogin = str8;
        }
        if ((i & 4096) == 0) {
            this.isBetaTester = false;
        } else {
            this.isBetaTester = z3;
        }
        if ((i & 8192) == 0) {
            this.hasPlus = false;
        } else {
            this.hasPlus = z4;
        }
        if ((i & 16384) == 0) {
            this.hasMusicSubscription = false;
        } else {
            this.hasMusicSubscription = z5;
        }
        if ((32768 & i) == 0) {
            this.firstName = null;
        } else {
            this.firstName = str9;
        }
        if ((65536 & i) == 0) {
            this.lastName = null;
        } else {
            this.lastName = str10;
        }
        if ((131072 & i) == 0) {
            this.birthday = null;
        } else {
            this.birthday = str11;
        }
        if ((262144 & i) == 0) {
            this.xTokenIssuedAt = 0;
        } else {
            this.xTokenIssuedAt = i4;
        }
        if ((524288 & i) == 0) {
            this.displayLogin = null;
        } else {
            this.displayLogin = str12;
        }
        if ((1048576 & i) == 0) {
            this.publicId = null;
        } else {
            this.publicId = str13;
        }
        if ((2097152 & i) == 0) {
            this.isChild = false;
        } else {
            this.isChild = z6;
        }
        if ((4194304 & i) == 0) {
            this.machineReadableLogin = null;
        } else {
            this.machineReadableLogin = str14;
        }
        if ((8388608 & i) == 0) {
            this.is2faEnabled = false;
        } else {
            this.is2faEnabled = z7;
        }
        if ((16777216 & i) == 0) {
            this.isSms2faEnabled = false;
        } else {
            this.isSms2faEnabled = z8;
        }
        if ((33554432 & i) == 0) {
            this.isRfc2faEnabled = false;
        } else {
            this.isRfc2faEnabled = z9;
        }
        this.partitions = (67108864 & i) == 0 ? EmptyList.a : list;
        if ((134217728 & i) == 0) {
            this.isPictureLoginForbidden = false;
        } else {
            this.isPictureLoginForbidden = z10;
        }
        if ((268435456 & i) == 0) {
            this.isXtokenTrusted = false;
        } else {
            this.isXtokenTrusted = z11;
        }
        if ((536870912 & i) == 0) {
            this.hasPlusCard = false;
        } else {
            this.hasPlusCard = z12;
        }
        if ((1073741824 & i) == 0) {
            this.hasProCard = false;
        } else {
            this.hasProCard = z13;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.hasFamily = false;
        } else {
            this.hasFamily = z14;
        }
        if ((i2 & 1) == 0) {
            this.isDriveUser = false;
        } else {
            this.isDriveUser = z15;
        }
        if ((i2 & 2) == 0) {
            this.isTaxiCompanyBound = false;
        } else {
            this.isTaxiCompanyBound = z16;
        }
        if ((i2 & 4) == 0) {
            this.locationId = null;
        } else {
            this.locationId = l;
        }
        this.filterParameters = (i2 & 8) == 0 ? kotlin.collections.b.f() : map;
        if ((i2 & 16) == 0) {
            this.muidValue = null;
        } else {
            this.muidValue = l2;
        }
        if ((i2 & 32) == 0) {
            this.hasMasterToken = false;
        } else {
            this.hasMasterToken = z17;
        }
        if ((i2 & 64) == 0) {
            this.isBrowserAccount = false;
        } else {
            this.isBrowserAccount = z18;
        }
        if ((i2 & 128) == 0) {
            this.hasWebAuthNCredential = false;
        } else {
            this.hasWebAuthNCredential = z19;
        }
    }

    public static /* synthetic */ void getAvatarUrl$annotations() {
    }

    public static /* synthetic */ void getBirthday$annotations() {
    }

    public static /* synthetic */ void getBody$annotations() {
    }

    public static /* synthetic */ void getDisplayLogin$annotations() {
    }

    public static /* synthetic */ void getDisplayName$annotations() {
    }

    public static /* synthetic */ void getETag$annotations() {
    }

    public static /* synthetic */ void getFilterParameters$annotations() {
    }

    public static /* synthetic */ void getFirstName$annotations() {
    }

    public static /* synthetic */ void getHasFamily$annotations() {
    }

    public static /* synthetic */ void getHasMasterToken$annotations() {
    }

    public static /* synthetic */ void getHasMusicSubscription$annotations() {
    }

    public static /* synthetic */ void getHasPassword$annotations() {
    }

    public static /* synthetic */ void getHasPlus$annotations() {
    }

    public static /* synthetic */ void getHasPlusCard$annotations() {
    }

    public static /* synthetic */ void getHasProCard$annotations() {
    }

    public static /* synthetic */ void getHasWebAuthNCredential$annotations() {
    }

    public static /* synthetic */ void getLastName$annotations() {
    }

    public static /* synthetic */ void getLocationId$annotations() {
    }

    public static /* synthetic */ void getMachineReadableLogin$annotations() {
    }

    public static /* synthetic */ void getMuidValue$annotations() {
    }

    public static /* synthetic */ void getNativeDefaultEmail$annotations() {
    }

    public static /* synthetic */ void getNormalizedDisplayLogin$annotations() {
    }

    public static /* synthetic */ void getPartitions$annotations() {
    }

    public static /* synthetic */ void getPrimaryAliasType$annotations() {
    }

    public static /* synthetic */ void getPublicId$annotations() {
    }

    public static /* synthetic */ void getPublicName$annotations() {
    }

    /* renamed from: getRetrievalTime-R7zlAxo$annotations, reason: not valid java name */
    public static /* synthetic */ void m292getRetrievalTimeR7zlAxo$annotations() {
    }

    public static /* synthetic */ void getSecurePhoneNumber$annotations() {
    }

    public static /* synthetic */ void getSocialProviderCode$annotations() {
    }

    public static /* synthetic */ void getUidValue$annotations() {
    }

    public static /* synthetic */ void getXTokenIssuedAt$annotations() {
    }

    public static /* synthetic */ void getYandexoidLogin$annotations() {
    }

    public static /* synthetic */ void is2faEnabled$annotations() {
    }

    public static /* synthetic */ void isAvatarEmpty$annotations() {
    }

    public static /* synthetic */ void isBetaTester$annotations() {
    }

    public static /* synthetic */ void isBrowserAccount$annotations() {
    }

    public static /* synthetic */ void isChild$annotations() {
    }

    public static /* synthetic */ void isDriveUser$annotations() {
    }

    public static /* synthetic */ void isPictureLoginForbidden$annotations() {
    }

    public static /* synthetic */ void isRfc2faEnabled$annotations() {
    }

    public static /* synthetic */ void isSms2faEnabled$annotations() {
    }

    public static /* synthetic */ void isTaxiCompanyBound$annotations() {
    }

    public static /* synthetic */ void isXtokenTrusted$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 json$lambda$0(acx acxVar) {
        acxVar.c = true;
        return zy11.a;
    }

    public static final /* synthetic */ void write$Self$passport_data_release(UserInfoData self, yjd output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = $childSerializers;
        output.s(serialDesc, 0, self.uidValue);
        output.o(serialDesc, 1, self.displayName);
        if (output.F() || self.publicName != null) {
            output.g(serialDesc, 2, auu0.a, self.publicName);
        }
        if (output.F() || self.securePhoneNumber != null) {
            output.g(serialDesc, 3, auu0.a, self.securePhoneNumber);
        }
        if (output.F() || self.normalizedDisplayLogin != null) {
            output.g(serialDesc, 4, auu0.a, self.normalizedDisplayLogin);
        }
        output.A(5, self.primaryAliasType, serialDesc);
        if (output.F() || self.nativeDefaultEmail != null) {
            output.g(serialDesc, 6, auu0.a, self.nativeDefaultEmail);
        }
        if (output.F() || self.avatarUrl != null) {
            output.g(serialDesc, 7, auu0.a, self.avatarUrl);
        }
        if (output.F() || self.isAvatarEmpty) {
            output.n(serialDesc, 8, self.isAvatarEmpty);
        }
        if (output.F() || self.socialProviderCode != null) {
            output.g(serialDesc, 9, auu0.a, self.socialProviderCode);
        }
        if (output.F() || self.hasPassword) {
            output.n(serialDesc, 10, self.hasPassword);
        }
        if (output.F() || self.yandexoidLogin != null) {
            output.g(serialDesc, 11, auu0.a, self.yandexoidLogin);
        }
        if (output.F() || self.isBetaTester) {
            output.n(serialDesc, 12, self.isBetaTester);
        }
        if (output.F() || self.hasPlus) {
            output.n(serialDesc, 13, self.hasPlus);
        }
        if (output.F() || self.hasMusicSubscription) {
            output.n(serialDesc, 14, self.hasMusicSubscription);
        }
        if (output.F() || self.firstName != null) {
            output.g(serialDesc, 15, auu0.a, self.firstName);
        }
        if (output.F() || self.lastName != null) {
            output.g(serialDesc, 16, auu0.a, self.lastName);
        }
        if (output.F() || self.birthday != null) {
            output.g(serialDesc, 17, auu0.a, self.birthday);
        }
        if (output.F() || self.xTokenIssuedAt != 0) {
            output.A(18, self.xTokenIssuedAt, serialDesc);
        }
        if (output.F() || self.displayLogin != null) {
            output.g(serialDesc, 19, auu0.a, self.displayLogin);
        }
        if (output.F() || self.publicId != null) {
            output.g(serialDesc, 20, auu0.a, self.publicId);
        }
        if (output.F() || self.isChild) {
            output.n(serialDesc, 21, self.isChild);
        }
        if (output.F() || self.machineReadableLogin != null) {
            output.g(serialDesc, 22, auu0.a, self.machineReadableLogin);
        }
        if (output.F() || self.is2faEnabled) {
            output.n(serialDesc, 23, self.is2faEnabled);
        }
        if (output.F() || self.isSms2faEnabled) {
            output.n(serialDesc, 24, self.isSms2faEnabled);
        }
        if (output.F() || self.isRfc2faEnabled) {
            output.n(serialDesc, 25, self.isRfc2faEnabled);
        }
        if (output.F() || !jl40.l(self.partitions, EmptyList.a)) {
            output.e(serialDesc, 26, kSerializerArr[26], self.partitions);
        }
        if (output.F() || self.isPictureLoginForbidden) {
            output.n(serialDesc, 27, self.isPictureLoginForbidden);
        }
        if (output.F() || self.isXtokenTrusted) {
            output.n(serialDesc, 28, self.isXtokenTrusted);
        }
        if (output.F() || self.hasPlusCard) {
            output.n(serialDesc, 29, self.hasPlusCard);
        }
        if (output.F() || self.hasProCard) {
            output.n(serialDesc, 30, self.hasProCard);
        }
        if (output.F() || self.hasFamily) {
            output.n(serialDesc, 31, self.hasFamily);
        }
        if (output.F() || self.isDriveUser) {
            output.n(serialDesc, 32, self.isDriveUser);
        }
        if (output.F() || self.isTaxiCompanyBound) {
            output.n(serialDesc, 33, self.isTaxiCompanyBound);
        }
        if (output.F() || self.locationId != null) {
            output.g(serialDesc, 34, pnz.a, self.locationId);
        }
        if (output.F() || !jl40.l(self.filterParameters, kotlin.collections.b.f())) {
            output.e(serialDesc, 35, kSerializerArr[35], self.filterParameters);
        }
        if (output.F() || self.muidValue != null) {
            output.g(serialDesc, 36, pnz.a, self.muidValue);
        }
        if (output.F() || self.hasMasterToken) {
            output.n(serialDesc, 37, self.hasMasterToken);
        }
        if (output.F() || self.isBrowserAccount) {
            output.n(serialDesc, 38, self.isBrowserAccount);
        }
        if (output.F() || self.hasWebAuthNCredential) {
            output.n(serialDesc, 39, self.hasWebAuthNCredential);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* renamed from: component10, reason: from getter */
    public final String getNativeDefaultEmail() {
        return this.nativeDefaultEmail;
    }

    /* renamed from: component11, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsAvatarEmpty() {
        return this.isAvatarEmpty;
    }

    /* renamed from: component13, reason: from getter */
    public final String getSocialProviderCode() {
        return this.socialProviderCode;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getHasPassword() {
        return this.hasPassword;
    }

    /* renamed from: component15, reason: from getter */
    public final String getYandexoidLogin() {
        return this.yandexoidLogin;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getIsBetaTester() {
        return this.isBetaTester;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getHasPlus() {
        return this.hasPlus;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getHasMusicSubscription() {
        return this.hasMusicSubscription;
    }

    /* renamed from: component19, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getETag() {
        return this.eTag;
    }

    /* renamed from: component20, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* renamed from: component21, reason: from getter */
    public final String getBirthday() {
        return this.birthday;
    }

    /* renamed from: component22, reason: from getter */
    public final int getXTokenIssuedAt() {
        return this.xTokenIssuedAt;
    }

    /* renamed from: component23, reason: from getter */
    public final String getDisplayLogin() {
        return this.displayLogin;
    }

    /* renamed from: component24, reason: from getter */
    public final String getPublicId() {
        return this.publicId;
    }

    /* renamed from: component25, reason: from getter */
    public final boolean getIsChild() {
        return this.isChild;
    }

    /* renamed from: component26, reason: from getter */
    public final String getMachineReadableLogin() {
        return this.machineReadableLogin;
    }

    /* renamed from: component27, reason: from getter */
    public final boolean getIs2faEnabled() {
        return this.is2faEnabled;
    }

    /* renamed from: component28, reason: from getter */
    public final boolean getIsSms2faEnabled() {
        return this.isSms2faEnabled;
    }

    /* renamed from: component29, reason: from getter */
    public final boolean getIsRfc2faEnabled() {
        return this.isRfc2faEnabled;
    }

    /* renamed from: component3-R7zlAxo, reason: not valid java name and from getter */
    public final long getRetrievalTime() {
        return this.retrievalTime;
    }

    public final List<String> component30() {
        return this.partitions;
    }

    /* renamed from: component31, reason: from getter */
    public final boolean getIsPictureLoginForbidden() {
        return this.isPictureLoginForbidden;
    }

    /* renamed from: component32, reason: from getter */
    public final boolean getIsXtokenTrusted() {
        return this.isXtokenTrusted;
    }

    /* renamed from: component33, reason: from getter */
    public final boolean getHasPlusCard() {
        return this.hasPlusCard;
    }

    /* renamed from: component34, reason: from getter */
    public final boolean getHasProCard() {
        return this.hasProCard;
    }

    /* renamed from: component35, reason: from getter */
    public final boolean getHasFamily() {
        return this.hasFamily;
    }

    /* renamed from: component36, reason: from getter */
    public final boolean getIsDriveUser() {
        return this.isDriveUser;
    }

    /* renamed from: component37, reason: from getter */
    public final boolean getIsTaxiCompanyBound() {
        return this.isTaxiCompanyBound;
    }

    /* renamed from: component38, reason: from getter */
    public final Long getLocationId() {
        return this.locationId;
    }

    public final Map<String, Set<String>> component39() {
        return this.filterParameters;
    }

    /* renamed from: component4, reason: from getter */
    public final long getUidValue() {
        return this.uidValue;
    }

    /* renamed from: component40, reason: from getter */
    public final Long getMuidValue() {
        return this.muidValue;
    }

    /* renamed from: component41, reason: from getter */
    public final boolean getHasMasterToken() {
        return this.hasMasterToken;
    }

    /* renamed from: component42, reason: from getter */
    public final boolean getIsBrowserAccount() {
        return this.isBrowserAccount;
    }

    /* renamed from: component43, reason: from getter */
    public final boolean getHasWebAuthNCredential() {
        return this.hasWebAuthNCredential;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPublicName() {
        return this.publicName;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSecurePhoneNumber() {
        return this.securePhoneNumber;
    }

    /* renamed from: component8, reason: from getter */
    public final String getNormalizedDisplayLogin() {
        return this.normalizedDisplayLogin;
    }

    /* renamed from: component9, reason: from getter */
    public final int getPrimaryAliasType() {
        return this.primaryAliasType;
    }

    /* renamed from: copy-wiADLzA, reason: not valid java name */
    public final UserInfoData m294copywiADLzA(String body, String eTag, long retrievalTime, long uidValue, String displayName, String publicName, String securePhoneNumber, String normalizedDisplayLogin, int primaryAliasType, String nativeDefaultEmail, String avatarUrl, boolean isAvatarEmpty, String socialProviderCode, boolean hasPassword, String yandexoidLogin, boolean isBetaTester, boolean hasPlus, boolean hasMusicSubscription, String firstName, String lastName, String birthday, int xTokenIssuedAt, String displayLogin, String publicId, boolean isChild, String machineReadableLogin, boolean is2faEnabled, boolean isSms2faEnabled, boolean isRfc2faEnabled, List<String> partitions, boolean isPictureLoginForbidden, boolean isXtokenTrusted, boolean hasPlusCard, boolean hasProCard, boolean hasFamily, boolean isDriveUser, boolean isTaxiCompanyBound, Long locationId, Map<String, ? extends Set<String>> filterParameters, Long muidValue, boolean hasMasterToken, boolean isBrowserAccount, boolean hasWebAuthNCredential) {
        return new UserInfoData(body, eTag, retrievalTime, uidValue, displayName, publicName, securePhoneNumber, normalizedDisplayLogin, primaryAliasType, nativeDefaultEmail, avatarUrl, isAvatarEmpty, socialProviderCode, hasPassword, yandexoidLogin, isBetaTester, hasPlus, hasMusicSubscription, firstName, lastName, birthday, xTokenIssuedAt, displayLogin, publicId, isChild, machineReadableLogin, is2faEnabled, isSms2faEnabled, isRfc2faEnabled, partitions, isPictureLoginForbidden, isXtokenTrusted, hasPlusCard, hasProCard, hasFamily, isDriveUser, isTaxiCompanyBound, locationId, filterParameters, muidValue, hasMasterToken, isBrowserAccount, hasWebAuthNCredential, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserInfoData)) {
            return false;
        }
        UserInfoData userInfoData = (UserInfoData) other;
        return jl40.l(this.body, userInfoData.body) && jl40.l(this.eTag, userInfoData.eTag) && com.yandex.passport.common.time.a.e(this.retrievalTime, userInfoData.retrievalTime) && this.uidValue == userInfoData.uidValue && jl40.l(this.displayName, userInfoData.displayName) && jl40.l(this.publicName, userInfoData.publicName) && jl40.l(this.securePhoneNumber, userInfoData.securePhoneNumber) && jl40.l(this.normalizedDisplayLogin, userInfoData.normalizedDisplayLogin) && this.primaryAliasType == userInfoData.primaryAliasType && jl40.l(this.nativeDefaultEmail, userInfoData.nativeDefaultEmail) && jl40.l(this.avatarUrl, userInfoData.avatarUrl) && this.isAvatarEmpty == userInfoData.isAvatarEmpty && jl40.l(this.socialProviderCode, userInfoData.socialProviderCode) && this.hasPassword == userInfoData.hasPassword && jl40.l(this.yandexoidLogin, userInfoData.yandexoidLogin) && this.isBetaTester == userInfoData.isBetaTester && this.hasPlus == userInfoData.hasPlus && this.hasMusicSubscription == userInfoData.hasMusicSubscription && jl40.l(this.firstName, userInfoData.firstName) && jl40.l(this.lastName, userInfoData.lastName) && jl40.l(this.birthday, userInfoData.birthday) && this.xTokenIssuedAt == userInfoData.xTokenIssuedAt && jl40.l(this.displayLogin, userInfoData.displayLogin) && jl40.l(this.publicId, userInfoData.publicId) && this.isChild == userInfoData.isChild && jl40.l(this.machineReadableLogin, userInfoData.machineReadableLogin) && this.is2faEnabled == userInfoData.is2faEnabled && this.isSms2faEnabled == userInfoData.isSms2faEnabled && this.isRfc2faEnabled == userInfoData.isRfc2faEnabled && jl40.l(this.partitions, userInfoData.partitions) && this.isPictureLoginForbidden == userInfoData.isPictureLoginForbidden && this.isXtokenTrusted == userInfoData.isXtokenTrusted && this.hasPlusCard == userInfoData.hasPlusCard && this.hasProCard == userInfoData.hasProCard && this.hasFamily == userInfoData.hasFamily && this.isDriveUser == userInfoData.isDriveUser && this.isTaxiCompanyBound == userInfoData.isTaxiCompanyBound && jl40.l(this.locationId, userInfoData.locationId) && jl40.l(this.filterParameters, userInfoData.filterParameters) && jl40.l(this.muidValue, userInfoData.muidValue) && this.hasMasterToken == userInfoData.hasMasterToken && this.isBrowserAccount == userInfoData.isBrowserAccount && this.hasWebAuthNCredential == userInfoData.hasWebAuthNCredential;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getBirthday() {
        return this.birthday;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getDisplayLogin() {
        return this.displayLogin;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getETag() {
        return this.eTag;
    }

    public final Map<String, Set<String>> getFilterParameters() {
        return this.filterParameters;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final boolean getHasFamily() {
        return this.hasFamily;
    }

    public final boolean getHasMasterToken() {
        return this.hasMasterToken;
    }

    public final boolean getHasMusicSubscription() {
        return this.hasMusicSubscription;
    }

    public final boolean getHasPassword() {
        return this.hasPassword;
    }

    public final boolean getHasPlus() {
        return this.hasPlus;
    }

    public final boolean getHasPlusCard() {
        return this.hasPlusCard;
    }

    public final boolean getHasProCard() {
        return this.hasProCard;
    }

    public final boolean getHasWebAuthNCredential() {
        return this.hasWebAuthNCredential;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final Long getLocationId() {
        return this.locationId;
    }

    public final String getMachineReadableLogin() {
        return this.machineReadableLogin;
    }

    public final Long getMuidValue() {
        return this.muidValue;
    }

    public final String getNativeDefaultEmail() {
        return this.nativeDefaultEmail;
    }

    public final String getNormalizedDisplayLogin() {
        return this.normalizedDisplayLogin;
    }

    public final List<String> getPartitions() {
        return this.partitions;
    }

    public final int getPrimaryAliasType() {
        return this.primaryAliasType;
    }

    public final String getPublicId() {
        return this.publicId;
    }

    public final String getPublicName() {
        return this.publicName;
    }

    /* renamed from: getRetrievalTime-R7zlAxo, reason: not valid java name */
    public final long m295getRetrievalTimeR7zlAxo() {
        return this.retrievalTime;
    }

    public final String getSecurePhoneNumber() {
        return this.securePhoneNumber;
    }

    public final String getSocialProviderCode() {
        return this.socialProviderCode;
    }

    public final long getUidValue() {
        return this.uidValue;
    }

    public final int getXTokenIssuedAt() {
        return this.xTokenIssuedAt;
    }

    public final String getYandexoidLogin() {
        return this.yandexoidLogin;
    }

    public int hashCode() {
        String str = this.body;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.eTag;
        int b = unr0.b(qv10.c(qv10.c((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.retrievalTime), 31, this.uidValue), 31, this.displayName);
        String str3 = this.publicName;
        int hashCode2 = (b + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.securePhoneNumber;
        int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.normalizedDisplayLogin;
        int b2 = oyr.b(this.primaryAliasType, (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        String str6 = this.nativeDefaultEmail;
        int hashCode4 = (b2 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.avatarUrl;
        int e = unr0.e((hashCode4 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.isAvatarEmpty);
        String str8 = this.socialProviderCode;
        int e2 = unr0.e((e + (str8 == null ? 0 : str8.hashCode())) * 31, 31, this.hasPassword);
        String str9 = this.yandexoidLogin;
        int e3 = unr0.e(unr0.e(unr0.e((e2 + (str9 == null ? 0 : str9.hashCode())) * 31, 31, this.isBetaTester), 31, this.hasPlus), 31, this.hasMusicSubscription);
        String str10 = this.firstName;
        int hashCode5 = (e3 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.lastName;
        int hashCode6 = (hashCode5 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.birthday;
        int b3 = oyr.b(this.xTokenIssuedAt, (hashCode6 + (str12 == null ? 0 : str12.hashCode())) * 31, 31);
        String str13 = this.displayLogin;
        int hashCode7 = (b3 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.publicId;
        int e4 = unr0.e((hashCode7 + (str14 == null ? 0 : str14.hashCode())) * 31, 31, this.isChild);
        String str15 = this.machineReadableLogin;
        int e5 = unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.c(unr0.e(unr0.e(unr0.e((e4 + (str15 == null ? 0 : str15.hashCode())) * 31, 31, this.is2faEnabled), 31, this.isSms2faEnabled), 31, this.isRfc2faEnabled), 31, this.partitions), 31, this.isPictureLoginForbidden), 31, this.isXtokenTrusted), 31, this.hasPlusCard), 31, this.hasProCard), 31, this.hasFamily), 31, this.isDriveUser), 31, this.isTaxiCompanyBound);
        Long l = this.locationId;
        int d = unr0.d((e5 + (l == null ? 0 : l.hashCode())) * 31, 31, this.filterParameters);
        Long l2 = this.muidValue;
        return Boolean.hashCode(this.hasWebAuthNCredential) + unr0.e(unr0.e((d + (l2 != null ? l2.hashCode() : 0)) * 31, 31, this.hasMasterToken), 31, this.isBrowserAccount);
    }

    public final boolean is2faEnabled() {
        return this.is2faEnabled;
    }

    public final boolean isAvatarEmpty() {
        return this.isAvatarEmpty;
    }

    public final boolean isBetaTester() {
        return this.isBetaTester;
    }

    public final boolean isBrowserAccount() {
        return this.isBrowserAccount;
    }

    public final boolean isChild() {
        return this.isChild;
    }

    public final boolean isDriveUser() {
        return this.isDriveUser;
    }

    public final boolean isPictureLoginForbidden() {
        return this.isPictureLoginForbidden;
    }

    public final boolean isRfc2faEnabled() {
        return this.isRfc2faEnabled;
    }

    public final boolean isSms2faEnabled() {
        return this.isSms2faEnabled;
    }

    public final boolean isTaxiCompanyBound() {
        return this.isTaxiCompanyBound;
    }

    public final boolean isXtokenTrusted() {
        return this.isXtokenTrusted;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UserInfoData(body=");
        sb.append(this.body);
        sb.append(", eTag=");
        sb.append(this.eTag);
        sb.append(", retrievalTime=");
        sb.append((Object) com.yandex.passport.common.time.a.f(this.retrievalTime));
        sb.append(", uidValue=");
        sb.append(this.uidValue);
        sb.append(", displayName=");
        sb.append(this.displayName);
        sb.append(", publicName=");
        sb.append(this.publicName);
        sb.append(", securePhoneNumber=");
        sb.append(this.securePhoneNumber);
        sb.append(", normalizedDisplayLogin=");
        sb.append(this.normalizedDisplayLogin);
        sb.append(", primaryAliasType=");
        sb.append(this.primaryAliasType);
        sb.append(", nativeDefaultEmail=");
        sb.append(this.nativeDefaultEmail);
        sb.append(", avatarUrl=");
        sb.append(this.avatarUrl);
        sb.append(", isAvatarEmpty=");
        sb.append(this.isAvatarEmpty);
        sb.append(", socialProviderCode=");
        sb.append(this.socialProviderCode);
        sb.append(", hasPassword=");
        sb.append(this.hasPassword);
        sb.append(", yandexoidLogin=");
        sb.append(this.yandexoidLogin);
        sb.append(", isBetaTester=");
        sb.append(this.isBetaTester);
        sb.append(", hasPlus=");
        sb.append(this.hasPlus);
        sb.append(", hasMusicSubscription=");
        sb.append(this.hasMusicSubscription);
        sb.append(", firstName=");
        sb.append(this.firstName);
        sb.append(", lastName=");
        sb.append(this.lastName);
        sb.append(", birthday=");
        sb.append(this.birthday);
        sb.append(", xTokenIssuedAt=");
        sb.append(this.xTokenIssuedAt);
        sb.append(", displayLogin=");
        sb.append(this.displayLogin);
        sb.append(", publicId=");
        sb.append(this.publicId);
        sb.append(", isChild=");
        sb.append(this.isChild);
        sb.append(", machineReadableLogin=");
        sb.append(this.machineReadableLogin);
        sb.append(", is2faEnabled=");
        sb.append(this.is2faEnabled);
        sb.append(", isSms2faEnabled=");
        sb.append(this.isSms2faEnabled);
        sb.append(", isRfc2faEnabled=");
        sb.append(this.isRfc2faEnabled);
        sb.append(", partitions=");
        sb.append(this.partitions);
        sb.append(", isPictureLoginForbidden=");
        sb.append(this.isPictureLoginForbidden);
        sb.append(", isXtokenTrusted=");
        sb.append(this.isXtokenTrusted);
        sb.append(", hasPlusCard=");
        sb.append(this.hasPlusCard);
        sb.append(", hasProCard=");
        sb.append(this.hasProCard);
        sb.append(", hasFamily=");
        sb.append(this.hasFamily);
        sb.append(", isDriveUser=");
        sb.append(this.isDriveUser);
        sb.append(", isTaxiCompanyBound=");
        sb.append(this.isTaxiCompanyBound);
        sb.append(", locationId=");
        sb.append(this.locationId);
        sb.append(", filterParameters=");
        sb.append(this.filterParameters);
        sb.append(", muidValue=");
        sb.append(this.muidValue);
        sb.append(", hasMasterToken=");
        sb.append(this.hasMasterToken);
        sb.append(", isBrowserAccount=");
        sb.append(this.isBrowserAccount);
        sb.append(", hasWebAuthNCredential=");
        return unr0.u(sb, this.hasWebAuthNCredential, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.body);
        dest.writeString(this.eTag);
        com.yandex.passport.internal.ui.c.M(this.retrievalTime, dest);
        dest.writeLong(this.uidValue);
        dest.writeString(this.displayName);
        dest.writeString(this.publicName);
        dest.writeString(this.securePhoneNumber);
        dest.writeString(this.normalizedDisplayLogin);
        dest.writeInt(this.primaryAliasType);
        dest.writeString(this.nativeDefaultEmail);
        dest.writeString(this.avatarUrl);
        dest.writeInt(this.isAvatarEmpty ? 1 : 0);
        dest.writeString(this.socialProviderCode);
        dest.writeInt(this.hasPassword ? 1 : 0);
        dest.writeString(this.yandexoidLogin);
        dest.writeInt(this.isBetaTester ? 1 : 0);
        dest.writeInt(this.hasPlus ? 1 : 0);
        dest.writeInt(this.hasMusicSubscription ? 1 : 0);
        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
        dest.writeString(this.birthday);
        dest.writeInt(this.xTokenIssuedAt);
        dest.writeString(this.displayLogin);
        dest.writeString(this.publicId);
        dest.writeInt(this.isChild ? 1 : 0);
        dest.writeString(this.machineReadableLogin);
        dest.writeInt(this.is2faEnabled ? 1 : 0);
        dest.writeInt(this.isSms2faEnabled ? 1 : 0);
        dest.writeInt(this.isRfc2faEnabled ? 1 : 0);
        dest.writeStringList(this.partitions);
        dest.writeInt(this.isPictureLoginForbidden ? 1 : 0);
        dest.writeInt(this.isXtokenTrusted ? 1 : 0);
        dest.writeInt(this.hasPlusCard ? 1 : 0);
        dest.writeInt(this.hasProCard ? 1 : 0);
        dest.writeInt(this.hasFamily ? 1 : 0);
        dest.writeInt(this.isDriveUser ? 1 : 0);
        dest.writeInt(this.isTaxiCompanyBound ? 1 : 0);
        Long l = this.locationId;
        if (l == null) {
            dest.writeInt(0);
        } else {
            xvz.z(dest, 1, l);
        }
        Iterator x = qv10.x(this.filterParameters, dest);
        while (x.hasNext()) {
            Map.Entry entry = (Map.Entry) x.next();
            dest.writeString((String) entry.getKey());
            Set set = (Set) entry.getValue();
            dest.writeInt(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                dest.writeString((String) it.next());
            }
        }
        Long l2 = this.muidValue;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            xvz.z(dest, 1, l2);
        }
        dest.writeInt(this.hasMasterToken ? 1 : 0);
        dest.writeInt(this.isBrowserAccount ? 1 : 0);
        dest.writeInt(this.hasWebAuthNCredential ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UserInfoData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserInfoData createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            String str;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            String str2;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            ArrayList<String> arrayList;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            boolean z18;
            boolean z19;
            boolean z20;
            boolean z21;
            Long l;
            LinkedHashMap linkedHashMap;
            String str3;
            boolean z22;
            String str4;
            boolean z23;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            long g = com.yandex.passport.internal.ui.c.g(parcel);
            long readLong = parcel.readLong();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            int readInt = parcel.readInt();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            boolean z24 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z24 = true;
                z2 = true;
            } else {
                z = false;
                z2 = true;
            }
            String readString9 = parcel.readString();
            if (parcel.readInt() != 0) {
                z3 = z2;
            } else {
                z3 = z2;
                z2 = z;
            }
            String readString10 = parcel.readString();
            if (parcel.readInt() != 0) {
                z4 = z3;
                str = readString10;
                z5 = z4;
            } else {
                z4 = z3;
                str = readString10;
                z5 = z;
            }
            if (parcel.readInt() != 0) {
                z6 = z4;
            } else {
                z6 = z4;
                z4 = z;
            }
            if (parcel.readInt() != 0) {
                z7 = z6;
            } else {
                z7 = z6;
                z6 = z;
            }
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            int readInt2 = parcel.readInt();
            String readString14 = parcel.readString();
            boolean z25 = z7;
            String readString15 = parcel.readString();
            if (parcel.readInt() != 0) {
                z8 = z25;
            } else {
                z8 = z25;
                z25 = z;
            }
            String readString16 = parcel.readString();
            if (parcel.readInt() != 0) {
                z9 = z8;
                str2 = readString16;
                z10 = z9;
            } else {
                z9 = z8;
                str2 = readString16;
                z10 = z;
            }
            if (parcel.readInt() != 0) {
                z11 = z9;
            } else {
                z11 = z9;
                z9 = z;
            }
            if (parcel.readInt() != 0) {
                z12 = z11;
            } else {
                z12 = z11;
                z11 = z;
            }
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                z13 = z12;
                arrayList = createStringArrayList;
                z14 = z13;
            } else {
                z13 = z12;
                arrayList = createStringArrayList;
                z14 = z;
            }
            if (parcel.readInt() != 0) {
                z15 = z13;
            } else {
                z15 = z13;
                z13 = z;
            }
            if (parcel.readInt() != 0) {
                z16 = z15;
            } else {
                z16 = z15;
                z15 = z;
            }
            if (parcel.readInt() != 0) {
                z17 = z16;
            } else {
                z17 = z16;
                z16 = z;
            }
            if (parcel.readInt() != 0) {
                z18 = z17;
            } else {
                z18 = z17;
                z17 = z;
            }
            if (parcel.readInt() != 0) {
                z19 = z18;
            } else {
                z19 = z18;
                z18 = z;
            }
            if (parcel.readInt() != 0) {
                z20 = z19;
            } else {
                z20 = z19;
                z19 = z;
            }
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            int readInt3 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt3);
            int i = 0;
            while (i != readInt3) {
                int i2 = readInt3;
                String readString17 = parcel.readString();
                int i3 = i;
                int readInt4 = parcel.readInt();
                long j = g;
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    linkedHashSet.add(parcel.readString());
                    i4++;
                    readInt4 = readInt4;
                }
                linkedHashMap2.put(readString17, linkedHashSet);
                i = i3 + 1;
                readInt3 = i2;
                g = j;
            }
            long j2 = g;
            Long valueOf2 = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
            if (parcel.readInt() != 0) {
                z21 = z20;
                l = valueOf;
                linkedHashMap = linkedHashMap2;
                str3 = readString;
                z22 = z21;
            } else {
                z21 = z20;
                l = valueOf;
                linkedHashMap = linkedHashMap2;
                str3 = readString;
                z22 = false;
            }
            if (parcel.readInt() != 0) {
                str4 = readString2;
                z23 = z21;
            } else {
                str4 = readString2;
                z23 = false;
            }
            return new UserInfoData(str3, str4, j2, readLong, readString3, readString4, readString5, readString6, readInt, readString7, readString8, z24, readString9, z2, str, z5, z4, z6, readString11, readString12, readString13, readInt2, readString14, readString15, z25, str2, z10, z9, z11, arrayList, z14, z13, z15, z16, z17, z18, z19, l, linkedHashMap, valueOf2, z22, z23, parcel.readInt() != 0 ? z21 : false, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserInfoData[] newArray(int i) {
            return new UserInfoData[i];
        }
    }

    public /* synthetic */ UserInfoData(String str, String str2, long j, long j2, String str3, String str4, String str5, String str6, int i, String str7, String str8, boolean z, String str9, boolean z2, String str10, boolean z3, boolean z4, boolean z5, String str11, String str12, String str13, int i2, String str14, String str15, boolean z6, String str16, boolean z7, boolean z8, boolean z9, List list, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, Long l, Map map, Long l2, boolean z17, boolean z18, boolean z19, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, j2, str3, str4, str5, str6, i, str7, str8, z, str9, z2, str10, z3, z4, z5, str11, str12, str13, i2, str14, str15, z6, str16, z7, z8, z9, (List<String>) list, z10, z11, z12, z13, z14, z15, z16, l, (Map<String, ? extends Set<String>>) map, l2, z17, z18, z19);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private UserInfoData(String str, String str2, long j, long j2, String str3, String str4, String str5, String str6, int i, String str7, String str8, boolean z, String str9, boolean z2, String str10, boolean z3, boolean z4, boolean z5, String str11, String str12, String str13, int i2, String str14, String str15, boolean z6, String str16, boolean z7, boolean z8, boolean z9, List<String> list, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, Long l, Map<String, ? extends Set<String>> map, Long l2, boolean z17, boolean z18, boolean z19) {
        this.body = str;
        this.eTag = str2;
        this.retrievalTime = j;
        this.uidValue = j2;
        this.displayName = str3;
        this.publicName = str4;
        this.securePhoneNumber = str5;
        this.normalizedDisplayLogin = str6;
        this.primaryAliasType = i;
        this.nativeDefaultEmail = str7;
        this.avatarUrl = str8;
        this.isAvatarEmpty = z;
        this.socialProviderCode = str9;
        this.hasPassword = z2;
        this.yandexoidLogin = str10;
        this.isBetaTester = z3;
        this.hasPlus = z4;
        this.hasMusicSubscription = z5;
        this.firstName = str11;
        this.lastName = str12;
        this.birthday = str13;
        this.xTokenIssuedAt = i2;
        this.displayLogin = str14;
        this.publicId = str15;
        this.isChild = z6;
        this.machineReadableLogin = str16;
        this.is2faEnabled = z7;
        this.isSms2faEnabled = z8;
        this.isRfc2faEnabled = z9;
        this.partitions = list;
        this.isPictureLoginForbidden = z10;
        this.isXtokenTrusted = z11;
        this.hasPlusCard = z12;
        this.hasProCard = z13;
        this.hasFamily = z14;
        this.isDriveUser = z15;
        this.isTaxiCompanyBound = z16;
        this.locationId = l;
        this.filterParameters = map;
        this.muidValue = l2;
        this.hasMasterToken = z17;
        this.isBrowserAccount = z18;
        this.hasWebAuthNCredential = z19;
    }

    public /* synthetic */ UserInfoData(String str, String str2, long j, long j2, String str3, String str4, String str5, String str6, int i, String str7, String str8, boolean z, String str9, boolean z2, String str10, boolean z3, boolean z4, boolean z5, String str11, String str12, String str13, int i2, String str14, String str15, boolean z6, String str16, boolean z7, boolean z8, boolean z9, List list, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, Long l, Map map, Long l2, boolean z17, boolean z18, boolean z19, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? 0L : j, j2, str3, (i3 & 32) != 0 ? null : str4, (i3 & 64) != 0 ? null : str5, (i3 & 128) != 0 ? null : str6, i, (i3 & 512) != 0 ? null : str7, (i3 & 1024) != 0 ? null : str8, (i3 & 2048) != 0 ? false : z, (i3 & 4096) != 0 ? null : str9, (i3 & 8192) != 0 ? false : z2, (i3 & 16384) != 0 ? null : str10, (32768 & i3) != 0 ? false : z3, (65536 & i3) != 0 ? false : z4, (131072 & i3) != 0 ? false : z5, (262144 & i3) != 0 ? null : str11, (524288 & i3) != 0 ? null : str12, (1048576 & i3) != 0 ? null : str13, (2097152 & i3) != 0 ? 0 : i2, (4194304 & i3) != 0 ? null : str14, (8388608 & i3) != 0 ? null : str15, (16777216 & i3) != 0 ? false : z6, (33554432 & i3) != 0 ? null : str16, (67108864 & i3) != 0 ? false : z7, (134217728 & i3) != 0 ? false : z8, (268435456 & i3) != 0 ? false : z9, (536870912 & i3) != 0 ? EmptyList.a : list, (1073741824 & i3) != 0 ? false : z10, (i3 & Integer.MIN_VALUE) != 0 ? false : z11, (i4 & 1) != 0 ? false : z12, (i4 & 2) != 0 ? false : z13, (i4 & 4) != 0 ? false : z14, (i4 & 8) != 0 ? false : z15, (i4 & 16) != 0 ? false : z16, (i4 & 32) != 0 ? null : l, (i4 & 64) != 0 ? kotlin.collections.b.f() : map, (i4 & 128) != 0 ? null : l2, (i4 & 256) != 0 ? false : z17, (i4 & 512) != 0 ? false : z18, (i4 & 1024) != 0 ? false : z19, null);
    }
}
