package com.yandex.mapkit.maps.core.utils.extensions.collections;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandlerImpl;
import defpackage.abl0;
import defpackage.bms;
import defpackage.e2r;
import defpackage.evu0;
import defpackage.h73;
import defpackage.i73;
import defpackage.j73;
import defpackage.jl40;
import defpackage.q2m0;
import defpackage.qha;
import defpackage.qrq0;
import defpackage.rrq0;
import defpackage.scc;
import defpackage.sls;
import defpackage.srq0;
import defpackage.tls;
import defpackage.vrq0;
import defpackage.wls;
import defpackage.ycc;
import defpackage.yw01;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.sequences.b;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000f\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001d\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0010\u001f\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\u0010&\n\u0002\b\u0006\u001aE\u0010\u0007\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002*\u00028\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aG\u0010\r\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00022\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000e\u001aA\u0010\r\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\r\u0010\u000f\u001a5\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0010*\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0013\u0010\u0014\u001aU\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012\"\u0004\b\u0000\u0010\u0003\"\u000e\b\u0001\u0010\u0015*\b\u0012\u0004\u0012\u00028\u00010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a9\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a'\u0010\u001d\u001a\u00020\u000b\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0010*\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u001d\u0010\u001e\u001aM\u0010#\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u001f2(\u0010\"\u001a$\u0012\u0004\u0012\u00020!\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00050 H\u0086\bø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001aG\u0010&\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u001f2\"\u0010\"\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00050%H\u0086\bø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001aY\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010\u001f\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0015*\b\u0012\u0004\u0012\u00028\u00000\u001f2(\u0010(\u001a$\u0012\u0004\u0012\u00020!\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u00010 H\u0086\bø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001aU\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00010\u001f\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0015*\b\u0012\u0004\u0012\u00028\u00000\u001f2$\u0010(\u001a \u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010%H\u0086\bø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a]\u0010/\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0015*\b\u0012\u0004\u0012\u00028\u00000\u001f2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010-2$\u0010(\u001a \u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010%H\u0086\bø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a7\u00101\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a=\u00103\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0018\u0010\"\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00050\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b3\u00104\u001a+\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u00105\u001a\u00020!¢\u0006\u0004\b6\u00107\u001a9\u00108\u001a\u0004\u0018\u00010!\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a9\u0010:\u001a\u0004\u0018\u00010!\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b:\u00109\u001a9\u00108\u001a\u0004\u0018\u00010!\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000;2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b8\u0010<\u001a;\u00108\u001a\u0004\u0018\u00010!\"\u0004\b\u0000\u0010\u0003*\n\u0012\u0006\b\u0001\u0012\u00028\u00000=2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b8\u0010>\u001a;\u0010:\u001a\u0004\u0018\u00010!\"\u0004\b\u0000\u0010\u0003*\n\u0012\u0006\b\u0001\u0012\u00028\u00000=2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b:\u0010>\u001a/\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\"\b\b\u0000\u0010\u0003*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010?\u001a\u00028\u0000¢\u0006\u0004\b@\u0010A\u001a/\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000;\"\b\b\u0000\u0010\u0003*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000;2\u0006\u0010?\u001a\u00028\u0000¢\u0006\u0004\b@\u0010B\u001a&\u0010C\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u0000*\u0006\u0012\u0002\b\u00030\u0011H\u0086\b¢\u0006\u0004\bC\u0010D\u001a&\u0010C\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u0000*\u0006\u0012\u0002\b\u00030;H\u0086\b¢\u0006\u0004\bC\u0010E\u001a&\u0010F\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u0000*\u0006\u0012\u0002\b\u00030\u0011H\u0086\b¢\u0006\u0004\bF\u0010D\u001a&\u0010F\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u0000*\u0006\u0012\u0002\b\u00030;H\u0086\b¢\u0006\u0004\bF\u0010E\u001a$\u0010G\u001a\u00020\u000b\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u0000*\u0006\u0012\u0002\b\u00030\u0011H\u0086\b¢\u0006\u0004\bG\u0010\u001e\u001a$\u0010G\u001a\u00020\u000b\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u0000*\u0006\u0012\u0002\b\u00030;H\u0086\b¢\u0006\u0004\bG\u0010H\u001a9\u0010K\u001a\u00020\u0005\"\b\b\u0000\u0010\u0003*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000I2\u0016\u0010J\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000=\"\u0004\u0018\u00018\u0000¢\u0006\u0004\bK\u0010L\u001a+\u0010N\u001a\u00020\u0005\"\b\b\u0000\u0010\u0003*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000I2\b\u0010M\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\bN\u0010O\u001a=\u0010S\u001a\u00020\u0005\"\b\b\u0000\u0010\u0003*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000-2\u0006\u0010P\u001a\u00020\u000b2\f\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000QH\u0086\bø\u0001\u0000¢\u0006\u0004\bS\u0010T\u001a!\u0010U\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000-¢\u0006\u0004\bU\u0010V\u001a!\u0010W\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000-¢\u0006\u0004\bW\u0010V\u001a \u0010Y\u001a\u00020\u000b*\u00020!2\n\u0010X\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0086\u0004¢\u0006\u0004\bY\u0010Z\u001a\u001f\u0010\\\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020[*\u0004\u0018\u00018\u0000¢\u0006\u0004\b\\\u0010]\u001a+\u0010_\u001a\b\u0012\u0004\u0012\u00028\u00000;\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000;2\u0006\u0010^\u001a\u00020!¢\u0006\u0004\b_\u0010`\u001a3\u0010_\u001a\b\u0012\u0004\u0012\u00028\u00000;\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000;2\u0006\u0010^\u001a\u00020!2\u0006\u0010a\u001a\u00020!¢\u0006\u0004\b_\u0010b\u001a3\u0010c\u001a\b\u0012\u0004\u0012\u00028\u00000;\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000;2\u0006\u0010^\u001a\u00020!2\u0006\u0010?\u001a\u00028\u0000¢\u0006\u0004\bc\u0010d\u001a9\u0010c\u001a\b\u0012\u0004\u0012\u00028\u00000;\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000;2\u0006\u0010^\u001a\u00020!2\f\u0010e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\bc\u0010f\u001a3\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000;\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000;2\u0006\u0010^\u001a\u00020!2\u0006\u0010?\u001a\u00028\u0000¢\u0006\u0004\bg\u0010d\u001a;\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000;\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000;2\u0006\u0010^\u001a\u00020!2\u0006\u0010a\u001a\u00020!2\u0006\u0010?\u001a\u00028\u0000¢\u0006\u0004\bg\u0010h\u001aA\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000;\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000;2\u0006\u0010^\u001a\u00020!2\u0006\u0010a\u001a\u00020!2\f\u0010e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\bg\u0010i\u001a*\u0010k\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000j2\b\u0010?\u001a\u0004\u0018\u00018\u0000H\u0086@¢\u0006\u0004\bk\u0010l\u001a-\u0010o\u001a\u0012\u0012\u0004\u0012\u00028\u00000mj\b\u0012\u0004\u0012\u00028\u0000`n\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u001f¢\u0006\u0004\bo\u0010p\u001a!\u0010q\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\"\u0004\b\u0000\u0010\u0003*\u0006\u0012\u0002\b\u00030=¢\u0006\u0004\bq\u0010r\u001a!\u0010s\u001a\u0004\u0018\u00018\u0000\"\f\b\u0000\u0010\u0003*\u0006\u0012\u0002\b\u00030\u0002*\u00028\u0000¢\u0006\u0004\bs\u0010t\u001a#\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u001f¢\u0006\u0004\bu\u0010v\u001aI\u0010{\u001a\u00020\u000b\"\u0004\b\u0000\u0010w\"\u0004\b\u0001\u0010x*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010y2\u001e\u0010\u001a\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010z\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b{\u0010|\u001aW\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010z\"\u0004\b\u0000\u0010w\"\u0004\b\u0001\u0010x*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010y2\u001e\u0010\u001a\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010z\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\u001b\u0010}\u001a+\u0010~\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010w\"\u0004\b\u0001\u0010x*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010y¢\u0006\u0004\b~\u0010\u007f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0080\u0001"}, d2 = {"", "E", "", "T", "Lkotlin/Function1;", "Lzy11;", "func", "withNotEmpty", "(Ljava/util/Collection;Ltls;)V", "other", "Lkotlin/Function2;", "", "equalizer", "equalsBy", "(Ljava/util/Collection;Ljava/util/Collection;Lwls;)Z", "(Ljava/util/Collection;Ljava/util/Collection;Ltls;)Z", "", "", "Lkotlin/Pair;", "minMax", "(Ljava/lang/Iterable;)Lkotlin/Pair;", "R", "selector", "minMaxBy", "(Ljava/lang/Iterable;Ltls;)Lkotlin/Pair;", "", "predicate", "removeFirst", "(Ljava/lang/Iterable;Ltls;)Ljava/lang/Object;", "isSorted", "(Ljava/lang/Iterable;)Z", "", "Lkotlin/Function4;", "", "action", "forEachWithNeighboursIndexed", "(Ljava/util/List;Lbms;)V", "Lkotlin/Function3;", "forEachWithNeighbours", "(Ljava/util/List;Lzls;)V", "transform", "mapWithNeighboursIndexed", "(Ljava/util/List;Lbms;)Ljava/util/List;", "mapNotNullWithNeighbours", "(Ljava/util/List;Lzls;)Ljava/util/List;", "", "destination", "mapNotNullWithNeighboursTo", "(Ljava/util/List;Ljava/util/List;Lzls;)V", "forEachWith", "(Ljava/lang/Iterable;Ltls;)V", "forEachWithIndexed", "(Ljava/lang/Iterable;Lwls;)V", "expectedSize", "toList", "(Ljava/lang/Iterable;I)Ljava/util/List;", "indexOfFirstOrNull", "(Ljava/util/List;Ltls;)Ljava/lang/Integer;", "indexOfLastOrNull", "Lqrq0;", "(Lqrq0;Ltls;)Ljava/lang/Integer;", "", "([Ljava/lang/Object;Ltls;)Ljava/lang/Integer;", "item", "startWith", "(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;", "(Lqrq0;Ljava/lang/Object;)Lqrq0;", "firstInstanceOfOrNull", "(Ljava/lang/Iterable;)Ljava/lang/Object;", "(Lqrq0;)Ljava/lang/Object;", "lastInstanceOfOrNull", "anyInstanceOf", "(Lqrq0;)Z", "", "values", "addAllNonNull", "(Ljava/util/Collection;[Ljava/lang/Object;)V", "value", "addNonNull", "(Ljava/util/Collection;Ljava/lang/Object;)V", "condition", "Lkotlin/Function0;", "block", "addIf", "(Ljava/util/List;ZLsls;)V", "removeFirstCompat", "(Ljava/util/List;)Ljava/lang/Object;", "removeLastCompat", "collection", "belongs", "(ILjava/util/Collection;)Z", "", "takeUnlessBlank", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "index", "remove", "(Lqrq0;I)Lqrq0;", "length", "(Lqrq0;II)Lqrq0;", "insert", "(Lqrq0;ILjava/lang/Object;)Lqrq0;", "items", "(Lqrq0;ILjava/lang/Iterable;)Lqrq0;", FlexRouteHandlerImpl.FLEX_CUSTOM_PROPS_REPLACE, "(Lqrq0;IILjava/lang/Object;)Lqrq0;", "(Lqrq0;IILjava/lang/Iterable;)Lqrq0;", "Lsrq0;", "yieldNonNull", "(Lsrq0;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "toArrayList", "(Ljava/util/List;)Ljava/util/ArrayList;", "toListUnsafe", "([Ljava/lang/Object;)Ljava/util/List;", "takeIfNotEmpty", "(Ljava/util/Collection;)Ljava/util/Collection;", "dropFirstAndLast", "(Ljava/util/List;)Ljava/util/List;", CA20Status.STATUS_REQUEST_K, CA20Status.STATUS_CERTIFICATE_V, "", "", "removeAll", "(Ljava/util/Map;Ltls;)Z", "(Ljava/util/Map;Ltls;)Ljava/util/Map$Entry;", "popFirst", "(Ljava/util/Map;)Ljava/lang/Object;", "exported-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CollectionExtensionsKt {
    public static final <T> void addAllNonNull(Collection<T> collection, T... tArr) {
        for (T t : tArr) {
            addNonNull(collection, t);
        }
    }

    public static final <T> void addIf(List<T> list, boolean z, sls slsVar) {
        addNonNull(list, z ? slsVar.invoke() : null);
    }

    public static final <T> void addNonNull(Collection<T> collection, T t) {
        if (t != null) {
            collection.add(t);
        }
    }

    public static final <T> boolean anyInstanceOf(Iterable<?> iterable) {
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator<?> it = iterable.iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next();
        jl40.P();
        throw null;
    }

    public static final boolean belongs(int i, Collection<?> collection) {
        return i >= 0 && i < collection.size();
    }

    public static final <T> List<T> dropFirstAndLast(List<? extends T> list) {
        return list.size() > 2 ? new ArrayList(list.subList(1, list.size() - 1)) : EmptyList.a;
    }

    public static final <T> boolean equalsBy(Collection<? extends T> collection, Collection<? extends T> collection2, tls tlsVar) {
        if (collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        CollectionExtensionsKt$equalsBy$2 collectionExtensionsKt$equalsBy$2 = CollectionExtensionsKt$equalsBy$2.INSTANCE;
        Iterator<T> it = collection.iterator();
        Iterator<T> it2 = collection2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (!((Boolean) collectionExtensionsKt$equalsBy$2.invoke(tlsVar.invoke(it.next()), tlsVar.invoke(it2.next()))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> T firstInstanceOfOrNull(Iterable<?> iterable) {
        Iterator<?> it = iterable.iterator();
        if (!it.hasNext()) {
            jl40.P();
            throw null;
        }
        it.next();
        jl40.P();
        throw null;
    }

    public static final <T> void forEachWith(Iterable<? extends T> iterable, tls tlsVar) {
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            tlsVar.invoke(it.next());
        }
    }

    public static final <T> void forEachWithIndexed(Iterable<? extends T> iterable, wls wlsVar) {
        int i = 0;
        for (T t : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            wlsVar.invoke(t, Integer.valueOf(i));
            i = i2;
        }
    }

    public static final <T> void forEachWithNeighbours(List<? extends T> list, zls zlsVar) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            Object S = a.S(i - 1, list);
            T t = list.get(i);
            i++;
            zlsVar.invoke(S, t, a.S(i, list));
        }
    }

    public static final <T> void forEachWithNeighboursIndexed(List<? extends T> list, bms bmsVar) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            bmsVar.invoke(Integer.valueOf(i), a.S(i - 1, list), list.get(i), a.S(i2, list));
            i = i2;
        }
    }

    public static final <T> Integer indexOfFirstOrNull(qrq0 qrq0Var, tls tlsVar) {
        Iterator it = qrq0Var.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Object next = it.next();
            if (i < 0) {
                scc.m();
                throw null;
            }
            if (((Boolean) tlsVar.invoke(next)).booleanValue()) {
                break;
            }
            i++;
        }
        Integer valueOf = Integer.valueOf(i);
        if (i >= 0) {
            return valueOf;
        }
        return null;
    }

    public static final <T> Integer indexOfLastOrNull(List<? extends T> list, tls tlsVar) {
        int i;
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i = -1;
                break;
            }
            if (((Boolean) tlsVar.invoke(listIterator.previous())).booleanValue()) {
                i = listIterator.nextIndex();
                break;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    public static final <T> qrq0 insert(qrq0 qrq0Var, int i, T t) {
        return insert(qrq0Var, i, (Iterable) Collections.singletonList(t));
    }

    public static final <T extends Comparable<? super T>> boolean isSorted(Iterable<? extends T> iterable) {
        rrq0 a = vrq0.a((wls) b.v(new h73(1, iterable), new qha(22)).b);
        while (a.hasNext()) {
            if (!((Boolean) a.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSorted$lambda$0(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2) <= 0;
    }

    public static final <T> T lastInstanceOfOrNull(Iterable<?> iterable) {
        Iterator<?> it = iterable.iterator();
        if (!it.hasNext()) {
            jl40.P();
            throw null;
        }
        it.next();
        jl40.P();
        throw null;
    }

    public static final <T, R> List<R> mapNotNullWithNeighbours(List<? extends T> list, zls zlsVar) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i = 0;
        while (i < size) {
            Object S = a.S(i - 1, list);
            T t = list.get(i);
            i++;
            Object invoke = zlsVar.invoke(S, t, a.S(i, list));
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> void mapNotNullWithNeighboursTo(List<? extends T> list, List<R> list2, zls zlsVar) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            Object S = a.S(i - 1, list);
            T t = list.get(i);
            i++;
            Object invoke = zlsVar.invoke(S, t, a.S(i, list));
            if (invoke != null) {
                list2.add(invoke);
            }
        }
    }

    public static final <T, R> List<R> mapWithNeighboursIndexed(List<? extends T> list, bms bmsVar) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            arrayList.add(bmsVar.invoke(Integer.valueOf(i), a.S(i - 1, list), list.get(i), a.S(i2, list)));
            i = i2;
        }
        return arrayList;
    }

    public static final <T extends Comparable<? super T>> Pair<T, T> minMax(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        T t = next;
        T t2 = t;
        T t3 = next;
        while (it.hasNext()) {
            T next2 = it.next();
            T t4 = next2;
            if (t.compareTo(t4) > 0) {
                next = next2;
                t = t4;
            }
            if (t2.compareTo(t4) < 0) {
                t3 = next2;
                t2 = t4;
            }
        }
        return new Pair<>(next, t3);
    }

    public static final <T, R extends Comparable<? super R>> Pair<T, T> minMaxBy(Iterable<? extends T> iterable, tls tlsVar) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        Comparable comparable = (Comparable) tlsVar.invoke(next);
        Comparable comparable2 = comparable;
        T t = next;
        while (it.hasNext()) {
            T next2 = it.next();
            Comparable comparable3 = (Comparable) tlsVar.invoke(next2);
            if (comparable.compareTo(comparable3) > 0) {
                next = next2;
                comparable = comparable3;
            }
            if (comparable2.compareTo(comparable3) < 0) {
                t = next2;
                comparable2 = comparable3;
            }
        }
        return new Pair<>(next, t);
    }

    public static final <K, V> V popFirst(Map<K, V> map) {
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        V value = it.next().getValue();
        it.remove();
        return value;
    }

    public static final <T> qrq0 remove(qrq0 qrq0Var, int i, int i2) {
        return replace(qrq0Var, i, i2, (Iterable) EmptyList.a);
    }

    public static final <K, V> boolean removeAll(Map<K, V> map, tls tlsVar) {
        return ycc.v(map.entrySet(), tlsVar, true);
    }

    public static final <K, V> Map.Entry<K, V> removeFirst(Map<K, V> map, tls tlsVar) {
        Iterator<T> it = map.entrySet().iterator();
        Object obj = null;
        if (it.hasNext()) {
            while (true) {
                Object next = it.next();
                if (((Boolean) tlsVar.invoke(next)).booleanValue()) {
                    it.remove();
                    obj = next;
                    break;
                }
                if (!it.hasNext()) {
                    break;
                }
            }
        }
        return (Map.Entry) obj;
    }

    public static final <T> T removeFirstCompat(List<T> list) {
        return list.remove(0);
    }

    public static final <T> T removeLastCompat(List<T> list) {
        return list.remove(scc.f(list));
    }

    public static final <T> qrq0 replace(qrq0 qrq0Var, int i, int i2, Iterable<? extends T> iterable) {
        e2r e2rVar;
        int i3 = 1;
        qrq0 v = j73.v(new qrq0[]{b.q(qrq0Var, i), new h73(i3, iterable)});
        q2m0 q2m0Var = new q2m0(21);
        if (v instanceof yw01) {
            yw01 yw01Var = (yw01) v;
            e2rVar = new e2r(i3, q2m0Var, yw01Var.a, yw01Var.b);
        } else {
            e2rVar = new e2r(i3, q2m0Var, v, new abl0(17));
        }
        return b.p(e2rVar, b.f(qrq0Var, i + i2));
    }

    public static final <T> List<T> startWith(Collection<? extends T> collection, T t) {
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.add(t);
        arrayList.addAll(collection);
        return arrayList;
    }

    public static final <T extends Collection<?>> T takeIfNotEmpty(T t) {
        if (t.isEmpty()) {
            return null;
        }
        return t;
    }

    public static final <T extends CharSequence> T takeUnlessBlank(T t) {
        if (t == null || evu0.J(t)) {
            return null;
        }
        return t;
    }

    public static final <T> ArrayList<T> toArrayList(List<? extends T> list) {
        return list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list);
    }

    public static final <T> List<T> toList(Iterable<? extends T> iterable, int i) {
        Iterator<? extends T> it = iterable.iterator();
        ArrayList arrayList = new ArrayList(i);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static final <T> List<T> toListUnsafe(Object[] objArr) {
        return j73.d0(objArr);
    }

    public static final <E, T extends Collection<? extends E>> void withNotEmpty(T t, tls tlsVar) {
        if (t.isEmpty()) {
            return;
        }
        tlsVar.invoke(t);
    }

    public static final <T> Object yieldNonNull(srq0 srq0Var, T t, Continuation<? super zy11> continuation) {
        CoroutineSingletons a;
        return (t == null || (a = srq0Var.a(t, continuation)) != CoroutineSingletons.COROUTINE_SUSPENDED) ? zy11.a : a;
    }

    public static final <T> qrq0 remove(qrq0 qrq0Var, int i) {
        return remove(qrq0Var, i, 1);
    }

    public static final <T> qrq0 insert(qrq0 qrq0Var, int i, Iterable<? extends T> iterable) {
        return replace(qrq0Var, i, 0, (Iterable) iterable);
    }

    public static final <T> qrq0 startWith(qrq0 qrq0Var, T t) {
        return b.p(new i73(5, t), qrq0Var);
    }

    public static final <T> T firstInstanceOfOrNull(qrq0 qrq0Var) {
        Iterator it = qrq0Var.iterator();
        if (it.hasNext()) {
            it.next();
            jl40.P();
            throw null;
        }
        jl40.P();
        throw null;
    }

    public static final <T> T lastInstanceOfOrNull(qrq0 qrq0Var) {
        Iterator it = qrq0Var.iterator();
        if (it.hasNext()) {
            it.next();
            jl40.P();
            throw null;
        }
        jl40.P();
        throw null;
    }

    public static final <T> boolean anyInstanceOf(qrq0 qrq0Var) {
        Iterator it = qrq0Var.iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next();
        jl40.P();
        throw null;
    }

    public static final <T> Integer indexOfFirstOrNull(List<? extends T> list, tls tlsVar) {
        Iterator<? extends T> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((Boolean) tlsVar.invoke(it.next())).booleanValue()) {
                break;
            }
            i++;
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    public static final <T> T removeFirst(Iterable<? extends T> iterable, tls tlsVar) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        do {
            T next = it.next();
            if (((Boolean) tlsVar.invoke(next)).booleanValue()) {
                it.remove();
                return next;
            }
        } while (it.hasNext());
        return null;
    }

    public static final <T> Integer indexOfLastOrNull(T[] tArr, tls tlsVar) {
        int i = -1;
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (((Boolean) tlsVar.invoke(tArr[length])).booleanValue()) {
                    i = length;
                    break;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    public static final <T> Integer indexOfFirstOrNull(T[] tArr, tls tlsVar) {
        int length = tArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (((Boolean) tlsVar.invoke(tArr[i])).booleanValue()) {
                break;
            }
            i++;
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    public static final <T> qrq0 replace(qrq0 qrq0Var, int i, T t) {
        return replace(qrq0Var, i, 1, (Iterable) Collections.singletonList(t));
    }

    public static final <T> qrq0 replace(qrq0 qrq0Var, int i, int i2, T t) {
        return replace(qrq0Var, i, i2, (Iterable) Collections.singletonList(t));
    }

    public static final <T> boolean equalsBy(Collection<? extends T> collection, Collection<? extends T> collection2, wls wlsVar) {
        if (collection2 != null && collection.size() == collection2.size()) {
            Iterator<T> it = collection.iterator();
            Iterator<T> it2 = collection2.iterator();
            do {
                if (!(it.hasNext() && it2.hasNext())) {
                    return true;
                }
            } while (((Boolean) wlsVar.invoke(it.next(), it2.next())).booleanValue());
        }
        return false;
    }
}
