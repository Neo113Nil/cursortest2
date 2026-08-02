package com.yandex.passport.common.core;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.vfc;
import defpackage.xvz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0010\u0000\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u0001Bé\u0003\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0010\u0012\b\b\u0002\u0010!\u001a\u00020\u0010\u0012\b\b\u0002\u0010\"\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#\u0012\b\b\u0002\u0010&\u001a\u00020\u0010\u0012\b\b\u0002\u0010'\u001a\u00020\u0010\u0012\b\b\u0002\u0010(\u001a\u00020\u0010\u0012\b\b\u0002\u0010)\u001a\u00020\u0010\u0012\b\b\u0002\u0010*\u001a\u00020\u0010\u0012\b\b\u0002\u0010+\u001a\u00020\u0010\u0012\b\b\u0002\u0010,\u001a\u00020\u0010\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0002\u0012\u001a\b\u0002\u00101\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0002000/\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u00103\u001a\u00020\u0010\u0012\b\b\u0002\u00104\u001a\u00020\u0010\u0012\b\b\u0002\u00105\u001a\u00020\u0010¢\u0006\u0004\b6\u00107J\u001d\u0010<\u001a\u00020;2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020\f¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\f¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bB\u0010AJ\u0010\u0010E\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0010\u0010F\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\bF\u0010DJ\u0010\u0010G\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bG\u0010AJ\u0012\u0010H\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bH\u0010AJ\u0012\u0010I\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bI\u0010AJ\u0010\u0010J\u001a\u00020\fHÆ\u0003¢\u0006\u0004\bJ\u0010?J\u0012\u0010K\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bK\u0010AJ\u0012\u0010L\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bL\u0010AJ\u0010\u0010M\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bM\u0010NJ\u0012\u0010O\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bO\u0010AJ\u0010\u0010P\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bP\u0010NJ\u0012\u0010Q\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bQ\u0010AJ\u0010\u0010R\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bR\u0010NJ\u0010\u0010S\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bS\u0010NJ\u0010\u0010T\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bT\u0010NJ\u0012\u0010U\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bU\u0010AJ\u0012\u0010V\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bV\u0010AJ\u0012\u0010W\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bW\u0010AJ\u0010\u0010X\u001a\u00020\fHÆ\u0003¢\u0006\u0004\bX\u0010?J\u0012\u0010Y\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bY\u0010AJ\u0012\u0010Z\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bZ\u0010AJ\u0010\u0010[\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b[\u0010NJ\u0012\u0010\\\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\\\u0010AJ\u0010\u0010]\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b]\u0010NJ\u0010\u0010^\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b^\u0010NJ\u0010\u0010_\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b_\u0010NJ\u0016\u0010`\u001a\b\u0012\u0004\u0012\u00020$0#HÆ\u0003¢\u0006\u0004\b`\u0010aJ\u0010\u0010b\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bb\u0010NJ\u0010\u0010c\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bc\u0010NJ\u0010\u0010d\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bd\u0010NJ\u0010\u0010e\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\be\u0010NJ\u0010\u0010f\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bf\u0010NJ\u0010\u0010g\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bg\u0010NJ\u0010\u0010h\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bh\u0010NJ\u0012\u0010i\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bi\u0010jJ\u0012\u0010k\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bk\u0010AJ\"\u0010l\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0002000/HÆ\u0003¢\u0006\u0004\bl\u0010mJ\u0012\u0010n\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bn\u0010jJ\u0010\u0010o\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bo\u0010NJ\u0010\u0010p\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bp\u0010NJ\u0010\u0010q\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bq\u0010NJø\u0003\u0010t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001b\u001a\u00020\f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00102\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010 \u001a\u00020\u00102\b\b\u0002\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\"\u001a\u00020\u00102\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\b\b\u0002\u0010&\u001a\u00020\u00102\b\b\u0002\u0010'\u001a\u00020\u00102\b\b\u0002\u0010(\u001a\u00020\u00102\b\b\u0002\u0010)\u001a\u00020\u00102\b\b\u0002\u0010*\u001a\u00020\u00102\b\b\u0002\u0010+\u001a\u00020\u00102\b\b\u0002\u0010,\u001a\u00020\u00102\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00022\u001a\b\u0002\u00101\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0002000/2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u00103\u001a\u00020\u00102\b\b\u0002\u00104\u001a\u00020\u00102\b\b\u0002\u00105\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\br\u0010sJ\u0010\u0010u\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bu\u0010AJ\u0010\u0010v\u001a\u00020\fHÖ\u0001¢\u0006\u0004\bv\u0010?J\u001a\u0010y\u001a\u00020\u00102\b\u0010x\u001a\u0004\u0018\u00010wHÖ\u0003¢\u0006\u0004\by\u0010zR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010{\u001a\u0004\b|\u0010AR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010{\u001a\u0004\b}\u0010AR\u001f\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\u0014\n\u0004\b\u0006\u0010~\u0012\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0004\b\u007f\u0010DR\u0018\u0010\b\u001a\u00020\u00078\u0006¢\u0006\r\n\u0004\b\b\u0010~\u001a\u0005\b\u0082\u0001\u0010DR\u0018\u0010\t\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b\t\u0010{\u001a\u0005\b\u0083\u0001\u0010AR\u001a\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\n\u0010{\u001a\u0005\b\u0084\u0001\u0010AR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u000b\u0010{\u001a\u0005\b\u0085\u0001\u0010AR\u0019\u0010\r\u001a\u00020\f8\u0006¢\u0006\u000e\n\u0005\b\r\u0010\u0086\u0001\u001a\u0005\b\u0087\u0001\u0010?R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u000e\u0010{\u001a\u0005\b\u0088\u0001\u0010AR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u000f\u0010{\u001a\u0005\b\u0089\u0001\u0010AR\u0018\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\r\n\u0005\b\u0011\u0010\u008a\u0001\u001a\u0004\b\u0011\u0010NR\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u0012\u0010{\u001a\u0005\b\u008b\u0001\u0010AR\u0019\u0010\u0013\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b\u0013\u0010\u008a\u0001\u001a\u0005\b\u008c\u0001\u0010NR\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u0014\u0010{\u001a\u0005\b\u008d\u0001\u0010AR\u0018\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\r\n\u0005\b\u0015\u0010\u008a\u0001\u001a\u0004\b\u0015\u0010NR\u0019\u0010\u0016\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b\u0016\u0010\u008a\u0001\u001a\u0005\b\u008e\u0001\u0010NR\u0019\u0010\u0017\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b\u0017\u0010\u008a\u0001\u001a\u0005\b\u008f\u0001\u0010NR\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u0018\u0010{\u001a\u0005\b\u0090\u0001\u0010AR\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u0019\u0010{\u001a\u0005\b\u0091\u0001\u0010AR\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001a\u0010{\u001a\u0005\b\u0092\u0001\u0010AR\u0019\u0010\u001b\u001a\u00020\f8\u0006¢\u0006\u000e\n\u0005\b\u001b\u0010\u0086\u0001\u001a\u0005\b\u0093\u0001\u0010?R\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001c\u0010{\u001a\u0005\b\u0094\u0001\u0010AR\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001d\u0010{\u001a\u0005\b\u0095\u0001\u0010AR\u0018\u0010\u001e\u001a\u00020\u00108\u0006¢\u0006\r\n\u0005\b\u001e\u0010\u008a\u0001\u001a\u0004\b\u001e\u0010NR\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001f\u0010{\u001a\u0005\b\u0096\u0001\u0010AR\u0018\u0010 \u001a\u00020\u00108\u0006¢\u0006\r\n\u0005\b \u0010\u008a\u0001\u001a\u0004\b \u0010NR\u0018\u0010!\u001a\u00020\u00108\u0006¢\u0006\r\n\u0005\b!\u0010\u008a\u0001\u001a\u0004\b!\u0010NR\u0018\u0010\"\u001a\u00020\u00108\u0006¢\u0006\r\n\u0005\b\"\u0010\u008a\u0001\u001a\u0004\b\"\u0010NR\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#8\u0006¢\u0006\u000e\n\u0005\b%\u0010\u0097\u0001\u001a\u0005\b\u0098\u0001\u0010aR\u0018\u0010&\u001a\u00020\u00108\u0006¢\u0006\r\n\u0005\b&\u0010\u008a\u0001\u001a\u0004\b&\u0010NR\u0018\u0010'\u001a\u00020\u00108\u0006¢\u0006\r\n\u0005\b'\u0010\u008a\u0001\u001a\u0004\b'\u0010NR\u0019\u0010(\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b(\u0010\u008a\u0001\u001a\u0005\b\u0099\u0001\u0010NR\u0019\u0010)\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b)\u0010\u008a\u0001\u001a\u0005\b\u009a\u0001\u0010NR\u0019\u0010*\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b*\u0010\u008a\u0001\u001a\u0005\b\u009b\u0001\u0010NR\u0018\u0010+\u001a\u00020\u00108\u0006¢\u0006\r\n\u0005\b+\u0010\u008a\u0001\u001a\u0004\b+\u0010NR\u0018\u0010,\u001a\u00020\u00108\u0006¢\u0006\r\n\u0005\b,\u0010\u008a\u0001\u001a\u0004\b,\u0010NR\u001b\u0010-\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\b-\u0010\u009c\u0001\u001a\u0005\b\u009d\u0001\u0010jR\u001a\u0010.\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b.\u0010{\u001a\u0005\b\u009e\u0001\u0010AR+\u00101\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0002000/8\u0006¢\u0006\u000e\n\u0005\b1\u0010\u009f\u0001\u001a\u0005\b \u0001\u0010mR\u001b\u00102\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\b2\u0010\u009c\u0001\u001a\u0005\b¡\u0001\u0010jR\u0019\u00103\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b3\u0010\u008a\u0001\u001a\u0005\b¢\u0001\u0010NR\u0018\u00104\u001a\u00020\u00108\u0006¢\u0006\r\n\u0005\b4\u0010\u008a\u0001\u001a\u0004\b4\u0010NR\u0019\u00105\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b5\u0010\u008a\u0001\u001a\u0005\b£\u0001\u0010NR\u0013\u0010¤\u0001\u001a\u00020\u00108F¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010N¨\u0006¥\u0001"}, d2 = {"Lcom/yandex/passport/common/core/UserInfo;", "Landroid/os/Parcelable;", "", "body", "eTag", "Lcom/yandex/passport/common/time/a;", "retrievalTime", "", "uidValue", "displayName", "publicName", "normalizedDisplayLogin", "", "primaryAliasType", "nativeDefaultEmail", "avatarUrl", "", "isAvatarEmpty", "socialProviderCode", "hasPassword", "yandexoidLogin", "isBetaTester", "hasPlus", "hasMusicSubscription", "firstName", "lastName", "birthday", "xTokenIssuedAt", "displayLogin", "publicId", "isChild", "machineReadableLogin", "is2faEnabled", "isSms2faEnabled", "isRfc2faEnabled", "", "Lcom/yandex/passport/common/core/Partition;", "partitions", "isPictureLoginForbidden", "isXtokenTrusted", "hasPlusCard", "hasProCard", "hasFamily", "isDriveUser", "isTaxiCompanyBound", "locationId", "phoneNumber", "", "", "filterParameters", "muidValue", "hasMasterToken", "isBrowserAccount", "hasWebAuthNCredential", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZLjava/util/List;ZZZZZZZLjava/lang/Long;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Long;ZZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3-R7zlAxo", "()J", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "()Z", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "()Ljava/util/List;", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "()Ljava/lang/Long;", "component38", "component39", "()Ljava/util/Map;", "component40", "component41", "component42", "component43", "copy-wiADLzA", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZLjava/util/List;ZZZZZZZLjava/lang/Long;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Long;ZZZ)Lcom/yandex/passport/common/core/UserInfo;", "copy", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBody", "getETag", "J", "getRetrievalTime-R7zlAxo", "getRetrievalTime-R7zlAxo$annotations", "()V", "getUidValue", "getDisplayName", "getPublicName", "getNormalizedDisplayLogin", CA20Status.STATUS_USER_I, "getPrimaryAliasType", "getNativeDefaultEmail", "getAvatarUrl", "Z", "getSocialProviderCode", "getHasPassword", "getYandexoidLogin", "getHasPlus", "getHasMusicSubscription", "getFirstName", "getLastName", "getBirthday", "getXTokenIssuedAt", "getDisplayLogin", "getPublicId", "getMachineReadableLogin", "Ljava/util/List;", "getPartitions", "getHasPlusCard", "getHasProCard", "getHasFamily", "Ljava/lang/Long;", "getLocationId", "getPhoneNumber", "Ljava/util/Map;", "getFilterParameters", "getMuidValue", "getHasMasterToken", "getHasWebAuthNCredential", "isYandexoid", "passport-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UserInfo implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<UserInfo> CREATOR = new Creator();
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
    private final List<Partition> partitions;
    private final String phoneNumber;
    private final int primaryAliasType;
    private final String publicId;
    private final String publicName;
    private final long retrievalTime;
    private final String socialProviderCode;
    private final long uidValue;
    private final int xTokenIssuedAt;
    private final String yandexoidLogin;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UserInfo(String str, String str2, long j, long j2, String str3, String str4, String str5, int i, String str6, String str7, boolean z, String str8, boolean z2, String str9, boolean z3, boolean z4, boolean z5, String str10, String str11, String str12, int i2, String str13, String str14, boolean z6, String str15, boolean z7, boolean z8, boolean z9, List list, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, Long l, String str16, Map map, Long l2, boolean z17, boolean z18, boolean z19, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(r5, r6, r7, j2, str3, r12, r13, i, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, (536870912 & i3) != 0 ? false : z10, (1073741824 & i3) != 0 ? false : z11, (i3 & Integer.MIN_VALUE) != 0 ? false : z12, (i4 & 1) != 0 ? false : z13, (i4 & 2) != 0 ? false : z14, (i4 & 4) != 0 ? false : z15, (i4 & 8) != 0 ? false : z16, (i4 & 16) != 0 ? null : l, (i4 & 32) != 0 ? null : str16, (i4 & 64) != 0 ? kotlin.collections.b.f() : map, (i4 & 128) != 0 ? null : l2, (i4 & 256) != 0 ? false : z17, (i4 & 512) != 0 ? false : z18, (i4 & 1024) != 0 ? false : z19, null);
        List list2;
        String str17;
        String str18 = (i3 & 1) != 0 ? null : str;
        String str19 = (i3 & 2) != 0 ? null : str2;
        long j3 = (i3 & 4) != 0 ? 0L : j;
        String str20 = (i3 & 32) != 0 ? null : str4;
        String str21 = (i3 & 64) != 0 ? null : str5;
        String str22 = (i3 & 256) != 0 ? null : str6;
        String str23 = (i3 & 512) != 0 ? null : str7;
        boolean z20 = (i3 & 1024) != 0 ? false : z;
        String str24 = (i3 & 2048) != 0 ? null : str8;
        boolean z21 = (i3 & 4096) != 0 ? false : z2;
        String str25 = (i3 & 8192) != 0 ? null : str9;
        boolean z22 = (i3 & 16384) != 0 ? false : z3;
        boolean z23 = (32768 & i3) != 0 ? false : z4;
        boolean z24 = (65536 & i3) != 0 ? false : z5;
        String str26 = (131072 & i3) != 0 ? null : str10;
        String str27 = (262144 & i3) != 0 ? null : str11;
        String str28 = (524288 & i3) != 0 ? null : str12;
        int i5 = (1048576 & i3) != 0 ? 0 : i2;
        String str29 = (2097152 & i3) != 0 ? null : str13;
        String str30 = (4194304 & i3) != 0 ? null : str14;
        boolean z25 = (8388608 & i3) != 0 ? false : z6;
        String str31 = (16777216 & i3) != 0 ? null : str15;
        boolean z26 = (33554432 & i3) != 0 ? false : z7;
        boolean z27 = (67108864 & i3) != 0 ? false : z8;
        boolean z28 = (134217728 & i3) != 0 ? false : z9;
        if ((268435456 & i3) != 0) {
            Partition.Companion.getClass();
            str17 = Partition.EMPTY;
            list2 = Collections.singletonList(Partition.m249boximpl(str17));
        } else {
            list2 = list;
        }
    }

    /* renamed from: getRetrievalTime-R7zlAxo$annotations, reason: not valid java name */
    public static /* synthetic */ void m260getRetrievalTimeR7zlAxo$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* renamed from: component10, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsAvatarEmpty() {
        return this.isAvatarEmpty;
    }

    /* renamed from: component12, reason: from getter */
    public final String getSocialProviderCode() {
        return this.socialProviderCode;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getHasPassword() {
        return this.hasPassword;
    }

    /* renamed from: component14, reason: from getter */
    public final String getYandexoidLogin() {
        return this.yandexoidLogin;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getIsBetaTester() {
        return this.isBetaTester;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getHasPlus() {
        return this.hasPlus;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getHasMusicSubscription() {
        return this.hasMusicSubscription;
    }

    /* renamed from: component18, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: component19, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getETag() {
        return this.eTag;
    }

    /* renamed from: component20, reason: from getter */
    public final String getBirthday() {
        return this.birthday;
    }

    /* renamed from: component21, reason: from getter */
    public final int getXTokenIssuedAt() {
        return this.xTokenIssuedAt;
    }

    /* renamed from: component22, reason: from getter */
    public final String getDisplayLogin() {
        return this.displayLogin;
    }

    /* renamed from: component23, reason: from getter */
    public final String getPublicId() {
        return this.publicId;
    }

    /* renamed from: component24, reason: from getter */
    public final boolean getIsChild() {
        return this.isChild;
    }

    /* renamed from: component25, reason: from getter */
    public final String getMachineReadableLogin() {
        return this.machineReadableLogin;
    }

    /* renamed from: component26, reason: from getter */
    public final boolean getIs2faEnabled() {
        return this.is2faEnabled;
    }

    /* renamed from: component27, reason: from getter */
    public final boolean getIsSms2faEnabled() {
        return this.isSms2faEnabled;
    }

    /* renamed from: component28, reason: from getter */
    public final boolean getIsRfc2faEnabled() {
        return this.isRfc2faEnabled;
    }

    public final List<Partition> component29() {
        return this.partitions;
    }

    /* renamed from: component3-R7zlAxo, reason: not valid java name and from getter */
    public final long getRetrievalTime() {
        return this.retrievalTime;
    }

    /* renamed from: component30, reason: from getter */
    public final boolean getIsPictureLoginForbidden() {
        return this.isPictureLoginForbidden;
    }

    /* renamed from: component31, reason: from getter */
    public final boolean getIsXtokenTrusted() {
        return this.isXtokenTrusted;
    }

    /* renamed from: component32, reason: from getter */
    public final boolean getHasPlusCard() {
        return this.hasPlusCard;
    }

    /* renamed from: component33, reason: from getter */
    public final boolean getHasProCard() {
        return this.hasProCard;
    }

    /* renamed from: component34, reason: from getter */
    public final boolean getHasFamily() {
        return this.hasFamily;
    }

    /* renamed from: component35, reason: from getter */
    public final boolean getIsDriveUser() {
        return this.isDriveUser;
    }

    /* renamed from: component36, reason: from getter */
    public final boolean getIsTaxiCompanyBound() {
        return this.isTaxiCompanyBound;
    }

    /* renamed from: component37, reason: from getter */
    public final Long getLocationId() {
        return this.locationId;
    }

    /* renamed from: component38, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
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
    public final String getNormalizedDisplayLogin() {
        return this.normalizedDisplayLogin;
    }

    /* renamed from: component8, reason: from getter */
    public final int getPrimaryAliasType() {
        return this.primaryAliasType;
    }

    /* renamed from: component9, reason: from getter */
    public final String getNativeDefaultEmail() {
        return this.nativeDefaultEmail;
    }

    /* renamed from: copy-wiADLzA, reason: not valid java name */
    public final UserInfo m262copywiADLzA(String body, String eTag, long retrievalTime, long uidValue, String displayName, String publicName, String normalizedDisplayLogin, int primaryAliasType, String nativeDefaultEmail, String avatarUrl, boolean isAvatarEmpty, String socialProviderCode, boolean hasPassword, String yandexoidLogin, boolean isBetaTester, boolean hasPlus, boolean hasMusicSubscription, String firstName, String lastName, String birthday, int xTokenIssuedAt, String displayLogin, String publicId, boolean isChild, String machineReadableLogin, boolean is2faEnabled, boolean isSms2faEnabled, boolean isRfc2faEnabled, List<Partition> partitions, boolean isPictureLoginForbidden, boolean isXtokenTrusted, boolean hasPlusCard, boolean hasProCard, boolean hasFamily, boolean isDriveUser, boolean isTaxiCompanyBound, Long locationId, String phoneNumber, Map<String, ? extends Set<String>> filterParameters, Long muidValue, boolean hasMasterToken, boolean isBrowserAccount, boolean hasWebAuthNCredential) {
        return new UserInfo(body, eTag, retrievalTime, uidValue, displayName, publicName, normalizedDisplayLogin, primaryAliasType, nativeDefaultEmail, avatarUrl, isAvatarEmpty, socialProviderCode, hasPassword, yandexoidLogin, isBetaTester, hasPlus, hasMusicSubscription, firstName, lastName, birthday, xTokenIssuedAt, displayLogin, publicId, isChild, machineReadableLogin, is2faEnabled, isSms2faEnabled, isRfc2faEnabled, partitions, isPictureLoginForbidden, isXtokenTrusted, hasPlusCard, hasProCard, hasFamily, isDriveUser, isTaxiCompanyBound, locationId, phoneNumber, filterParameters, muidValue, hasMasterToken, isBrowserAccount, hasWebAuthNCredential, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserInfo)) {
            return false;
        }
        UserInfo userInfo = (UserInfo) other;
        return jl40.l(this.body, userInfo.body) && jl40.l(this.eTag, userInfo.eTag) && com.yandex.passport.common.time.a.e(this.retrievalTime, userInfo.retrievalTime) && this.uidValue == userInfo.uidValue && jl40.l(this.displayName, userInfo.displayName) && jl40.l(this.publicName, userInfo.publicName) && jl40.l(this.normalizedDisplayLogin, userInfo.normalizedDisplayLogin) && this.primaryAliasType == userInfo.primaryAliasType && jl40.l(this.nativeDefaultEmail, userInfo.nativeDefaultEmail) && jl40.l(this.avatarUrl, userInfo.avatarUrl) && this.isAvatarEmpty == userInfo.isAvatarEmpty && jl40.l(this.socialProviderCode, userInfo.socialProviderCode) && this.hasPassword == userInfo.hasPassword && jl40.l(this.yandexoidLogin, userInfo.yandexoidLogin) && this.isBetaTester == userInfo.isBetaTester && this.hasPlus == userInfo.hasPlus && this.hasMusicSubscription == userInfo.hasMusicSubscription && jl40.l(this.firstName, userInfo.firstName) && jl40.l(this.lastName, userInfo.lastName) && jl40.l(this.birthday, userInfo.birthday) && this.xTokenIssuedAt == userInfo.xTokenIssuedAt && jl40.l(this.displayLogin, userInfo.displayLogin) && jl40.l(this.publicId, userInfo.publicId) && this.isChild == userInfo.isChild && jl40.l(this.machineReadableLogin, userInfo.machineReadableLogin) && this.is2faEnabled == userInfo.is2faEnabled && this.isSms2faEnabled == userInfo.isSms2faEnabled && this.isRfc2faEnabled == userInfo.isRfc2faEnabled && jl40.l(this.partitions, userInfo.partitions) && this.isPictureLoginForbidden == userInfo.isPictureLoginForbidden && this.isXtokenTrusted == userInfo.isXtokenTrusted && this.hasPlusCard == userInfo.hasPlusCard && this.hasProCard == userInfo.hasProCard && this.hasFamily == userInfo.hasFamily && this.isDriveUser == userInfo.isDriveUser && this.isTaxiCompanyBound == userInfo.isTaxiCompanyBound && jl40.l(this.locationId, userInfo.locationId) && jl40.l(this.phoneNumber, userInfo.phoneNumber) && jl40.l(this.filterParameters, userInfo.filterParameters) && jl40.l(this.muidValue, userInfo.muidValue) && this.hasMasterToken == userInfo.hasMasterToken && this.isBrowserAccount == userInfo.isBrowserAccount && this.hasWebAuthNCredential == userInfo.hasWebAuthNCredential;
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

    public final List<Partition> getPartitions() {
        return this.partitions;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
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
    public final long m263getRetrievalTimeR7zlAxo() {
        return this.retrievalTime;
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
        String str4 = this.normalizedDisplayLogin;
        int b2 = oyr.b(this.primaryAliasType, (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        String str5 = this.nativeDefaultEmail;
        int hashCode3 = (b2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.avatarUrl;
        int e = unr0.e((hashCode3 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.isAvatarEmpty);
        String str7 = this.socialProviderCode;
        int e2 = unr0.e((e + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.hasPassword);
        String str8 = this.yandexoidLogin;
        int e3 = unr0.e(unr0.e(unr0.e((e2 + (str8 == null ? 0 : str8.hashCode())) * 31, 31, this.isBetaTester), 31, this.hasPlus), 31, this.hasMusicSubscription);
        String str9 = this.firstName;
        int hashCode4 = (e3 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.lastName;
        int hashCode5 = (hashCode4 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.birthday;
        int b3 = oyr.b(this.xTokenIssuedAt, (hashCode5 + (str11 == null ? 0 : str11.hashCode())) * 31, 31);
        String str12 = this.displayLogin;
        int hashCode6 = (b3 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.publicId;
        int e4 = unr0.e((hashCode6 + (str13 == null ? 0 : str13.hashCode())) * 31, 31, this.isChild);
        String str14 = this.machineReadableLogin;
        int e5 = unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.c(unr0.e(unr0.e(unr0.e((e4 + (str14 == null ? 0 : str14.hashCode())) * 31, 31, this.is2faEnabled), 31, this.isSms2faEnabled), 31, this.isRfc2faEnabled), 31, this.partitions), 31, this.isPictureLoginForbidden), 31, this.isXtokenTrusted), 31, this.hasPlusCard), 31, this.hasProCard), 31, this.hasFamily), 31, this.isDriveUser), 31, this.isTaxiCompanyBound);
        Long l = this.locationId;
        int hashCode7 = (e5 + (l == null ? 0 : l.hashCode())) * 31;
        String str15 = this.phoneNumber;
        int d = unr0.d((hashCode7 + (str15 == null ? 0 : str15.hashCode())) * 31, 31, this.filterParameters);
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

    public final boolean isYandexoid() {
        String str = this.yandexoidLogin;
        return !(str == null || str.length() == 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UserInfo(body=");
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
        sb.append(", phoneNumber=");
        sb.append(this.phoneNumber);
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
        dest.writeLong(this.retrievalTime);
        dest.writeLong(this.uidValue);
        dest.writeString(this.displayName);
        dest.writeString(this.publicName);
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
        Iterator t = vfc.t(dest, this.partitions);
        while (t.hasNext()) {
            Partition.m256writeToParcelimpl(((Partition) t.next()).m257unboximpl(), dest, flags);
        }
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
        dest.writeString(this.phoneNumber);
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
    public static final class Creator implements Parcelable.Creator<UserInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserInfo createFromParcel(Parcel parcel) {
            long b;
            boolean z;
            String str;
            boolean z2;
            String str2;
            String str3;
            boolean z3;
            String str4;
            boolean z4;
            String str5;
            boolean z5;
            String str6;
            boolean z6;
            String str7;
            String str8;
            boolean z7;
            String str9;
            boolean z8;
            String str10;
            boolean z9;
            boolean z10;
            long j;
            boolean z11;
            Long valueOf;
            Long l;
            String str11;
            boolean z12;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            b = com.yandex.passport.common.time.a.b(0L, 0L, 0L, parcel.readLong());
            long readLong = parcel.readLong();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            int readInt = parcel.readInt();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            boolean z13 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z13 = true;
            } else {
                z = false;
            }
            String readString8 = parcel.readString();
            if (parcel.readInt() != 0) {
                str = readString8;
                z2 = true;
            } else {
                str = readString8;
                z2 = z;
            }
            String readString9 = parcel.readString();
            if (parcel.readInt() != 0) {
                str2 = str;
                str3 = readString9;
                z3 = true;
            } else {
                str2 = str;
                str3 = readString9;
                z3 = z;
            }
            if (parcel.readInt() != 0) {
                str4 = str2;
                z4 = true;
            } else {
                str4 = str2;
                z4 = z;
            }
            if (parcel.readInt() != 0) {
                str5 = str4;
                z5 = true;
            } else {
                str5 = str4;
                z5 = z;
            }
            String readString10 = parcel.readString();
            String str12 = str5;
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            int readInt2 = parcel.readInt();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            if (parcel.readInt() != 0) {
                str6 = str12;
                z6 = true;
            } else {
                str6 = str12;
                z6 = z;
            }
            String readString15 = parcel.readString();
            if (parcel.readInt() != 0) {
                str7 = str6;
                str8 = readString15;
                z7 = true;
            } else {
                str7 = str6;
                str8 = readString15;
                z7 = z;
            }
            if (parcel.readInt() != 0) {
                str9 = str7;
                z8 = true;
            } else {
                str9 = str7;
                z8 = z;
            }
            if (parcel.readInt() != 0) {
                str10 = str9;
                z9 = true;
            } else {
                str10 = str9;
                z9 = z;
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            int i = 0;
            while (i != readInt3) {
                i = oo31.d(Partition.CREATOR, parcel, arrayList, i, 1);
                readInt3 = readInt3;
                readString2 = readString2;
                b = b;
            }
            String str13 = readString2;
            long j2 = b;
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            boolean z16 = parcel.readInt() != 0;
            boolean z17 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z10 = true;
                j = j2;
                z11 = true;
            } else {
                z10 = true;
                j = j2;
                z11 = false;
            }
            boolean z18 = parcel.readInt() != 0 ? z10 : false;
            boolean z19 = parcel.readInt() != 0 ? z10 : false;
            if (parcel.readInt() == 0) {
                valueOf = null;
                l = null;
            } else {
                valueOf = Long.valueOf(parcel.readLong());
                l = null;
            }
            String readString16 = parcel.readString();
            int readInt4 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt4);
            int i2 = 0;
            while (i2 != readInt4) {
                int i3 = readInt4;
                String readString17 = parcel.readString();
                int i4 = i2;
                int readInt5 = parcel.readInt();
                long j3 = j;
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt5);
                int i5 = 0;
                while (i5 != readInt5) {
                    linkedHashSet.add(parcel.readString());
                    i5++;
                    readInt5 = readInt5;
                }
                linkedHashMap.put(readString17, linkedHashSet);
                i2 = i4 + 1;
                readInt4 = i3;
                j = j3;
            }
            long j4 = j;
            Long valueOf2 = parcel.readInt() == 0 ? l : Long.valueOf(parcel.readLong());
            boolean z20 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                str11 = str13;
                z12 = true;
            } else {
                str11 = str13;
                z12 = false;
            }
            return new UserInfo(readString, str11, j4, readLong, readString3, readString4, readString5, readInt, readString6, readString7, z13, str10, z2, str3, z3, z4, z5, readString10, readString11, readString12, readInt2, readString13, readString14, z6, str8, z7, z8, z9, arrayList, z14, z15, z16, z17, z11, z18, z19, valueOf, readString16, linkedHashMap, valueOf2, z20, z12, parcel.readInt() != 0, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserInfo[] newArray(int i) {
            return new UserInfo[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private UserInfo(String str, String str2, long j, long j2, String str3, String str4, String str5, int i, String str6, String str7, boolean z, String str8, boolean z2, String str9, boolean z3, boolean z4, boolean z5, String str10, String str11, String str12, int i2, String str13, String str14, boolean z6, String str15, boolean z7, boolean z8, boolean z9, List<Partition> list, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, Long l, String str16, Map<String, ? extends Set<String>> map, Long l2, boolean z17, boolean z18, boolean z19) {
        this.body = str;
        this.eTag = str2;
        this.retrievalTime = j;
        this.uidValue = j2;
        this.displayName = str3;
        this.publicName = str4;
        this.normalizedDisplayLogin = str5;
        this.primaryAliasType = i;
        this.nativeDefaultEmail = str6;
        this.avatarUrl = str7;
        this.isAvatarEmpty = z;
        this.socialProviderCode = str8;
        this.hasPassword = z2;
        this.yandexoidLogin = str9;
        this.isBetaTester = z3;
        this.hasPlus = z4;
        this.hasMusicSubscription = z5;
        this.firstName = str10;
        this.lastName = str11;
        this.birthday = str12;
        this.xTokenIssuedAt = i2;
        this.displayLogin = str13;
        this.publicId = str14;
        this.isChild = z6;
        this.machineReadableLogin = str15;
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
        this.phoneNumber = str16;
        this.filterParameters = map;
        this.muidValue = l2;
        this.hasMasterToken = z17;
        this.isBrowserAccount = z18;
        this.hasWebAuthNCredential = z19;
    }

    public /* synthetic */ UserInfo(String str, String str2, long j, long j2, String str3, String str4, String str5, int i, String str6, String str7, boolean z, String str8, boolean z2, String str9, boolean z3, boolean z4, boolean z5, String str10, String str11, String str12, int i2, String str13, String str14, boolean z6, String str15, boolean z7, boolean z8, boolean z9, List list, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, Long l, String str16, Map map, Long l2, boolean z17, boolean z18, boolean z19, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, j2, str3, str4, str5, i, str6, str7, z, str8, z2, str9, z3, z4, z5, str10, str11, str12, i2, str13, str14, z6, str15, z7, z8, z9, list, z10, z11, z12, z13, z14, z15, z16, l, str16, map, l2, z17, z18, z19);
    }
}
