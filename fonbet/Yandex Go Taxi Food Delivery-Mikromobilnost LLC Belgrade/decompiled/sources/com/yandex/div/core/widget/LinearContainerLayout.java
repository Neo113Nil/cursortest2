package com.yandex.div.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.internal.widget.DivViewGroup;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.b6w;
import defpackage.ffx;
import defpackage.gpl;
import defpackage.h8;
import defpackage.hpl;
import defpackage.jl40;
import defpackage.kgx;
import defpackage.liy;
import defpackage.m810;
import defpackage.oyr;
import defpackage.q5z;
import defpackage.qkj;
import defpackage.qoi0;
import defpackage.scc;
import defpackage.tls;
import defpackage.wls;
import defpackage.xbi0;
import defpackage.xcc;
import defpackage.y83;
import defpackage.zy11;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\bA\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0010\u0018\u0000 Û\u00012\u00020\u00012\u00020\u0002:\u0002Ü\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b \u0010!J7\u0010'\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0014¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0007H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b/\u0010\u001bJ\u0017\u00100\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b0\u0010\u001bJ\u001f\u00101\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b1\u00102J!\u00103\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b3\u00104J9\u00105\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00152\u0006\u00107\u001a\u00020\u0007H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u0007H\u0002¢\u0006\u0004\b;\u0010.J\u001f\u0010<\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b<\u0010!J'\u0010?\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020=2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b?\u0010@J\u001f\u0010A\u001a\u00020\u00152\u0006\u0010>\u001a\u00020=2\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\bA\u0010BJ7\u0010E\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020=2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010C\u001a\u00020\u00152\u0006\u0010D\u001a\u00020\u0015H\u0002¢\u0006\u0004\bE\u0010FJ/\u0010G\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020=2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010D\u001a\u00020\u0015H\u0002¢\u0006\u0004\bG\u0010HJ/\u0010I\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020=2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010D\u001a\u00020\u0015H\u0002¢\u0006\u0004\bI\u0010HJ\u001f\u0010J\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\bJ\u0010!J\u001f\u0010K\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020=2\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\bK\u0010LJ/\u0010P\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010M\u001a\u00020\u00072\u0006\u0010N\u001a\u00020\u00072\u0006\u0010O\u001a\u00020\u0007H\u0002¢\u0006\u0004\bP\u0010\u0011J\u001f\u0010S\u001a\u00020\u00152\u0006\u0010Q\u001a\u00020\u00072\u0006\u0010R\u001a\u00020\u0007H\u0002¢\u0006\u0004\bS\u0010TJ'\u0010U\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020\u0007H\u0002¢\u0006\u0004\bU\u0010VJ/\u0010Y\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020=2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010W\u001a\u00020\u00072\u0006\u0010X\u001a\u00020\u0007H\u0002¢\u0006\u0004\bY\u0010ZJ/\u0010[\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010O\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020\u0007H\u0002¢\u0006\u0004\b[\u0010\u0011J\u001f\u0010\\\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020\u00072\u0006\u0010R\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\\\u0010]J\u001f\u0010`\u001a\u00020\u000f2\u0006\u0010^\u001a\u00020\u00072\u0006\u0010_\u001a\u00020\u0015H\u0002¢\u0006\u0004\b`\u0010aJ\u001f\u0010b\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\bb\u0010!J'\u0010c\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020=2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\bc\u0010@J\u001f\u0010d\u001a\u00020\u00152\u0006\u0010>\u001a\u00020=2\u0006\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\bd\u0010BJ\u001f\u0010g\u001a\u00020\u00152\u0006\u0010e\u001a\u00020\u00072\u0006\u0010f\u001a\u00020\u0007H\u0002¢\u0006\u0004\bg\u0010TJ'\u0010h\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020=2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\bh\u0010@J'\u0010i\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020=2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\bi\u0010@J\u001f\u0010j\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020=2\u0006\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\bj\u0010LJ\u0017\u0010l\u001a\u00020\u00072\u0006\u0010k\u001a\u00020\u0007H\u0002¢\u0006\u0004\bl\u0010.J'\u0010n\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010m\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\bn\u0010VJ'\u0010o\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020\u0007H\u0002¢\u0006\u0004\bo\u0010VJ'\u0010p\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020\u0007H\u0002¢\u0006\u0004\bp\u0010VJ'\u0010r\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020=2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010q\u001a\u00020\u0015H\u0002¢\u0006\u0004\br\u0010sJ\u001f\u0010t\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020=2\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\bt\u0010LJ'\u0010v\u001a\u00020\u00072\u0006\u0010>\u001a\u00020=2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010u\u001a\u00020\u0007H\u0002¢\u0006\u0004\bv\u0010wJ\u001f\u0010y\u001a\u00020\u000f2\u0006\u0010k\u001a\u00020\u00072\u0006\u0010x\u001a\u00020\u0007H\u0002¢\u0006\u0004\by\u0010!J\u001f\u0010|\u001a\u00020\u00072\u0006\u0010z\u001a\u00020\u00072\u0006\u0010{\u001a\u00020\u0007H\u0002¢\u0006\u0004\b|\u0010]J\u0017\u0010}\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b}\u0010~J(\u0010\u0081\u0001\u001a\u00020\u000f2\u0013\u0010\u0080\u0001\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u000f0\u007fH\u0082\b¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J/\u0010\u0084\u0001\u001a\u00020\u000f2\u001a\u0010\u0080\u0001\u001a\u0015\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f0\u0083\u0001H\u0082\b¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J1\u0010\u0086\u0001\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0005\b\u0086\u0001\u0010\u0011J1\u0010\u0087\u0001\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0005\b\u0087\u0001\u0010\u0011J:\u0010\u0088\u0001\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020=2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010u\u001a\u00020\u00072\u0006\u0010X\u001a\u00020\u0007H\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J&\u0010\u008d\u0001\u001a\u00030\u008a\u00012\b\u0010\u008b\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u008c\u0001\u001a\u00020\u0007H\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0019\u0010\u008f\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0019\u0010\u0091\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0090\u0001R9\u0010\u0099\u0001\u001a\u00020\u00072\u0007\u0010\u0092\u0001\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u001e\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u0012\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0005\b\u0095\u0001\u0010\u001d\"\u0005\b\u0096\u0001\u0010\u0014R\u0019\u0010\u009a\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u0090\u0001R\u0019\u0010\u009b\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u0090\u0001R\u0019\u0010\u009c\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u0090\u0001R\u0019\u0010\u009d\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u0090\u0001R\u0019\u0010\u009e\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u0090\u0001R5\u0010¤\u0001\u001a\u00030\u008a\u00012\b\u0010\u0092\u0001\u001a\u00030\u008a\u00018V@VX\u0096\u008e\u0002¢\u0006\u0018\n\u0006\b\u009f\u0001\u0010\u0094\u0001\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R\u0019\u0010¥\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010\u0090\u0001R\u0019\u0010¦\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010\u0090\u0001R\u0019\u0010§\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010\u0090\u0001R\u0019\u0010¨\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010\u0090\u0001R\u0019\u0010©\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010\u0090\u0001R\u0019\u0010ª\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010\u0090\u0001R\u0019\u0010«\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010\u0090\u0001R\u001c\u0010\u00ad\u0001\u001a\u00070¬\u0001R\u00020\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R\u0019\u0010¯\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010\u0090\u0001R\u0019\u0010°\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010\u0090\u0001R8\u0010³\u0001\u001a\u0005\u0018\u00010±\u00012\n\u0010²\u0001\u001a\u0005\u0018\u00010±\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001R9\u0010½\u0001\u001a\u00020\u00072\u0007\u0010\u0092\u0001\u001a\u00020\u00078F@FX\u0087\u008e\u0002¢\u0006\u001e\n\u0006\b¹\u0001\u0010\u0094\u0001\u0012\u0006\b¼\u0001\u0010\u0098\u0001\u001a\u0005\bº\u0001\u0010\u001d\"\u0005\b»\u0001\u0010\u0014R\u001e\u0010¿\u0001\u001a\t\u0012\u0004\u0012\u00020=0¾\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001R\u001e\u0010Â\u0001\u001a\t\u0012\u0004\u0012\u00020=0Á\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R\u0019\u0010Ä\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010\u0090\u0001R\u001e\u0010Å\u0001\u001a\t\u0012\u0004\u0012\u00020=0¾\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010À\u0001R\u001e\u0010Æ\u0001\u001a\t\u0012\u0004\u0012\u00020=0Á\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010Ã\u0001R\u001a\u0010Ç\u0001\u001a\u00030\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010È\u0001R+\u0010Ê\u0001\u001a\u0016\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070É\u00010¾\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÊ\u0001\u0010À\u0001R\u0016\u0010Ì\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bË\u0001\u0010\u001dR\u0016\u0010Î\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÍ\u0001\u0010\u001dR\u001b\u0010Ñ\u0001\u001a\u00020\u0007*\u00020=8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÏ\u0001\u0010Ð\u0001R\u001a\u0010W\u001a\u00020\u0007*\u00020=8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÒ\u0001\u0010Ð\u0001R\u0016\u0010Ô\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÓ\u0001\u0010\u001dR\u0016\u0010Õ\u0001\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÕ\u0001\u0010\u0017R\u001c\u0010Ø\u0001\u001a\u00030\u008a\u0001*\u00020)8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÖ\u0001\u0010×\u0001R\u001c\u0010Ú\u0001\u001a\u00030\u008a\u0001*\u00020)8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÙ\u0001\u0010×\u0001¨\u0006Ý\u0001"}, d2 = {"Lcom/yandex/div/core/widget/LinearContainerLayout;", "Lcom/yandex/div/internal/widget/DivViewGroup;", "Ly83;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "left", "top", "right", "bottom", "Lzy11;", "setDividerMargins", "(IIII)V", "px", "setItemSpacing", "(I)V", "", "shouldDelayChildPressedState", "()Z", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "getBaseline", "()I", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Lcom/yandex/div/internal/widget/DivLayoutParams;", "generateDefaultLayoutParams", "()Lcom/yandex/div/internal/widget/DivLayoutParams;", CoreConstants.PushMessage.SERVICE_TYPE, "gapBeforeChild", "(I)I", "drawDividersVertical", "drawDividersHorizontal", "drawHorizontalDivider", "(Landroid/graphics/Canvas;I)V", "drawVerticalDivider", "(Landroid/graphics/Canvas;I)Lzy11;", "drawDivider", "(Landroid/graphics/Canvas;IIII)Lzy11;", "childIndex", "hasDividerBeforeChildAt", "(I)Z", "index", "getDividerOffsetBeforeChildAt", "measureVertical", "Landroid/view/View;", "child", "measureChildWithSignificantSizeVertical", "(Landroid/view/View;II)V", "hasSignificantHeight", "(Landroid/view/View;I)Z", "considerWidth", "considerHeight", "measureVerticalFirstTime", "(Landroid/view/View;IIZZ)V", "measureConstrainedHeightChildFirstTime", "(Landroid/view/View;IIZ)V", "measureMatchParentHeightChildFirstTime", "considerMatchParentChildrenInMaxWidth", "measureMatchParentWidthChild", "(Landroid/view/View;I)V", "heightSize", "heightSpec", "initialMaxWidth", "remeasureChildrenVerticalIfNeeded", "delta", "spec", "needRemeasureChildren", "(II)Z", "remeasureConstrainedHeightChildren", "(III)V", "maxWidth", "height", "remeasureChildVertical", "(Landroid/view/View;III)V", "remeasureMatchParentHeightChildren", "getFreeSpace", "(II)I", "freeSpace", "horizontal", "calculateMatchParentSizes", "(IZ)V", "measureHorizontal", "measureChildWithSignificantSizeHorizontal", "hasSignificantWidth", "dimension", "parentMeasureSpec", "hasSignificantDimension", "measureConstrainedWidthChildFirstTime", "measureMatchParentWidthChildFirstTime", "considerMatchParentChildMarginsInWidth", "measureSpec", "getWidthSizeAndState", "widthSize", "remeasureChildrenHorizontalIfNeeded", "remeasureConstrainedWidthChildren", "remeasureMatchParentWidthChildren", "measureChild", "considerMatchParentChildInMaxHeight", "(Landroid/view/View;IZ)V", "remeasureDynamicHeightChild", "width", "remeasureChildHorizontal", "(Landroid/view/View;II)I", "childSize", "updateMaxCrossSize", "current", Constants.KEY_ADDITIONAL, "getMaxLength", "updateBaselineOffset", "(Landroid/view/View;)V", "Lkotlin/Function1;", "action", "forEachSignificant", "(Ltls;)V", "Lkotlin/Function2;", "forEachSignificantIndexed", "(Lwls;)V", "layoutVertical", "layoutHorizontal", "setChildFrame", "(Landroid/view/View;IIII)V", "", "weight", "size", "getFixedWeight", "(FI)F", "maxBaselineAscent", CA20Status.STATUS_USER_I, "maxBaselineDescent", "<set-?>", "orientation$delegate", "Lxbi0;", "getOrientation", "setOrientation", "getOrientation$annotations", "()V", "orientation", "totalLength", "totalConstrainedLength", "totalMatchParentLength", "skippedMatchParentMinSizeLength", "childMeasuredState", "aspectRatio$delegate", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "aspectRatio", "dividerWidth", "dividerHeight", "dividerMarginTop", "dividerMarginBottom", "dividerMarginLeft", "dividerMarginRight", "itemSpacingPx", "Lhpl;", "offsetsHolder", "Lhpl;", "firstVisibleChildIndex", "lastVisibleChildIndex", "Landroid/graphics/drawable/Drawable;", "value", "dividerDrawable", "Landroid/graphics/drawable/Drawable;", "getDividerDrawable", "()Landroid/graphics/drawable/Drawable;", "setDividerDrawable", "(Landroid/graphics/drawable/Drawable;)V", "showDividers$delegate", "getShowDividers", "setShowDividers", "getShowDividers$annotations", "showDividers", "", "constrainedChildren", "Ljava/util/List;", "", "skippedMatchParentChildren", "Ljava/util/Set;", "maxCrossSize", "mainMatchParentChildren", "crossMatchParentChildren", "totalWeight", "F", "Lkotlin/Pair;", "matchParentSizes", "getDividerHeightWithMargins", "dividerHeightWithMargins", "getDividerWidthWithMargins", "dividerWidthWithMargins", "getMaxHeight", "(Landroid/view/View;)I", "maxHeight", "getMaxWidth", "getVisibleChildCount", "visibleChildCount", "isVertical", "getFixedHorizontalWeight", "(Lcom/yandex/div/internal/widget/DivLayoutParams;)F", "fixedHorizontalWeight", "getFixedVerticalWeight", "fixedVerticalWeight", "Companion", "liy", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class LinearContainerLayout extends DivViewGroup implements y83 {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new MutablePropertyReference1Impl("orientation", 0, "getOrientation()I", LinearContainerLayout.class), oyr.B(qoi0.a, LinearContainerLayout.class, "aspectRatio", "getAspectRatio()F", 0), new MutablePropertyReference1Impl("showDividers", 0, "getShowDividers()I", LinearContainerLayout.class)};
    private static final liy Companion = new liy();
    private static final Pair<Integer, Integer> emptySize = new Pair<>(0, 0);

    /* renamed from: aspectRatio$delegate, reason: from kotlin metadata */
    private final xbi0 aspectRatio;
    private int childMeasuredState;
    private final List<View> constrainedChildren;
    private final Set<View> crossMatchParentChildren;
    private Drawable dividerDrawable;
    private int dividerHeight;
    private int dividerMarginBottom;
    private int dividerMarginLeft;
    private int dividerMarginRight;
    private int dividerMarginTop;
    private int dividerWidth;
    private int firstVisibleChildIndex;
    private int itemSpacingPx;
    private int lastVisibleChildIndex;
    private final List<View> mainMatchParentChildren;
    private final List<Pair<Integer, Integer>> matchParentSizes;
    private int maxBaselineAscent;
    private int maxBaselineDescent;
    private int maxCrossSize;
    private final hpl offsetsHolder;

    /* renamed from: orientation$delegate, reason: from kotlin metadata */
    private final xbi0 orientation;

    /* renamed from: showDividers$delegate, reason: from kotlin metadata */
    private final xbi0 showDividers;
    private final Set<View> skippedMatchParentChildren;
    private int skippedMatchParentMinSizeLength;
    private int totalConstrainedLength;
    private int totalLength;
    private int totalMatchParentLength;
    private float totalWeight;

    /* loaded from: classes11.dex */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            View view = (View) obj2;
            View view2 = (View) obj;
            return Float.valueOf(view.getMinimumHeight() / view.getMeasuredHeight()).compareTo(Float.valueOf(view2.getMinimumHeight() / view2.getMeasuredHeight()));
        }
    }

    /* loaded from: classes11.dex */
    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            View view = (View) obj2;
            View view2 = (View) obj;
            return Float.valueOf(view.getMinimumWidth() / view.getMeasuredWidth()).compareTo(Float.valueOf(view2.getMinimumWidth() / view2.getMeasuredWidth()));
        }
    }

    public LinearContainerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.maxBaselineAscent = -1;
        this.maxBaselineDescent = -1;
        this.orientation = q5z.o(0);
        this.aspectRatio = new qkj(AspectView$Companion$aspectRatioProperty$1.w, Float.valueOf(0.0f));
        this.offsetsHolder = new hpl();
        this.firstVisibleChildIndex = -1;
        this.lastVisibleChildIndex = -1;
        this.showDividers = q5z.o(0);
        this.constrainedChildren = new ArrayList();
        this.skippedMatchParentChildren = new LinkedHashSet();
        this.mainMatchParentChildren = new ArrayList();
        this.crossMatchParentChildren = new LinkedHashSet();
        this.matchParentSizes = new ArrayList();
    }

    private final void calculateMatchParentSizes(int freeSpace, boolean horizontal) {
        float f;
        int i = freeSpace + this.skippedMatchParentMinSizeLength;
        float f2 = this.totalWeight;
        Pair<Integer, Integer> pair = emptySize;
        while (i != 0) {
            float f3 = 0.0f;
            if (f2 <= 0.0f) {
                return;
            }
            float f4 = f2;
            Pair<Integer, Integer> pair2 = pair;
            float f5 = 0.0f;
            int i2 = 0;
            int i3 = i;
            for (Object obj : this.mainMatchParentChildren) {
                int i4 = i2 + 1;
                if (i2 < 0) {
                    scc.m();
                    throw null;
                }
                View view = (View) obj;
                Pair<Integer, Integer> pair3 = this.matchParentSizes.get(i2);
                int intValue = ((Number) pair3.getFirst()).intValue();
                int intValue2 = ((Number) pair3.getSecond()).intValue();
                if (intValue == intValue2) {
                    DivLayoutParams divLayoutParams = (DivLayoutParams) view.getLayoutParams();
                    float fixedHorizontalWeight = horizontal ? getFixedHorizontalWeight(divLayoutParams) : getFixedVerticalWeight(divLayoutParams);
                    float f6 = (i * fixedHorizontalWeight) / f2;
                    f = f3;
                    int b2 = m810.b(f6);
                    float f7 = b2 - f6;
                    f5 += f7;
                    int i5 = b2 + intValue2;
                    if (Math.abs(f5) >= 1.0f && f7 != f) {
                        float signum = Math.signum(f7);
                        i5 -= (int) signum;
                        f5 -= signum;
                    }
                    int min = Math.min(Math.max(i5, horizontal ? view.getMinimumWidth() : view.getMinimumHeight()), horizontal ? divLayoutParams.getMaxWidth() : divLayoutParams.getMaxHeight());
                    i3 -= min - intValue2;
                    if (i5 != min) {
                        f4 -= fixedHorizontalWeight;
                    }
                    pair2 = new Pair<>(Integer.valueOf(i5), Integer.valueOf(min));
                    this.matchParentSizes.set(i2, pair2);
                } else {
                    f = f3;
                }
                f3 = f;
                i2 = i4;
            }
            if (i3 == 1 || i3 == -1) {
                List<Pair<Integer, Integer>> list = this.matchParentSizes;
                list.set(scc.f(list), new Pair<>(Integer.valueOf(((Number) pair2.c()).intValue() + i3), Integer.valueOf(((Number) pair2.f()).intValue() + i3)));
                f2 = f4;
                pair = pair2;
                i = 0;
            } else {
                i = i3;
                f2 = f4;
                pair = pair2;
            }
        }
    }

    private final void considerMatchParentChildInMaxHeight(View child, int heightMeasureSpec, boolean measureChild) {
        DivLayoutParams divLayoutParams = (DivLayoutParams) child.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) divLayoutParams).height != -1) {
            return;
        }
        if (measureChild) {
            this.maxCrossSize = Math.max(this.maxCrossSize, divLayoutParams.getVerticalMargins$div_release() + child.getMinimumHeight());
        } else {
            remeasureChildHorizontal(child, heightMeasureSpec, child.getMeasuredWidth());
            updateMaxCrossSize(heightMeasureSpec, divLayoutParams.getVerticalMargins$div_release() + child.getMeasuredHeight());
        }
    }

    private final void considerMatchParentChildMarginsInWidth(View child, int widthMeasureSpec) {
        if (hasSignificantWidth(child, widthMeasureSpec)) {
            return;
        }
        this.totalLength = getMaxLength(this.totalLength, ((DivLayoutParams) child.getLayoutParams()).getHorizontalMargins$div_release());
    }

    private final void considerMatchParentChildrenInMaxWidth(int widthMeasureSpec, int heightMeasureSpec) {
        if (q5z.I(widthMeasureSpec)) {
            return;
        }
        int i = this.maxCrossSize;
        Set<View> set = this.crossMatchParentChildren;
        if (i != 0) {
            for (View view : set) {
                this.maxCrossSize = Math.max(this.maxCrossSize, ((DivLayoutParams) view.getLayoutParams()).getHorizontalMargins$div_release() + view.getMinimumWidth());
            }
            return;
        }
        for (View view2 : set) {
            LinearContainerLayout linearContainerLayout = this;
            linearContainerLayout.measureVerticalFirstTime(view2, widthMeasureSpec, heightMeasureSpec, true, false);
            linearContainerLayout.skippedMatchParentChildren.remove(view2);
            this = linearContainerLayout;
        }
    }

    private final zy11 drawDivider(Canvas canvas, int left, int top, int right, int bottom) {
        Drawable drawable = this.dividerDrawable;
        if (drawable == null) {
            return null;
        }
        float f = (left + right) / 2.0f;
        float f2 = (top + bottom) / 2.0f;
        float f3 = this.dividerWidth / 2.0f;
        float f4 = this.dividerHeight / 2.0f;
        drawable.setBounds(Math.max((int) (f - f3), left), Math.max((int) (f2 - f4), top), Math.min((int) (f + f3), right), Math.min((int) (f2 + f4), bottom));
        drawable.draw(canvas);
        return zy11.a;
    }

    private final void drawDividersHorizontal(Canvas canvas) {
        int right;
        int i;
        int left;
        int i2;
        int i3;
        boolean W = ffx.W(this);
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && hasDividerBeforeChildAt(i4)) {
                int dividerOffsetBeforeChildAt = getDividerOffsetBeforeChildAt(i4);
                drawVerticalDivider(canvas, W ? childAt.getRight() + ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) childAt.getLayoutParams())).rightMargin + this.dividerMarginLeft + dividerOffsetBeforeChildAt : (((childAt.getLeft() - ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) childAt.getLayoutParams())).leftMargin) - this.dividerWidth) - this.dividerMarginRight) - dividerOffsetBeforeChildAt);
            }
        }
        if (hasDividerBeforeChildAt(getChildCount())) {
            View childAt2 = getChildAt(getChildCount() - 1);
            if (childAt2 != null || !W) {
                if (childAt2 == null) {
                    left = ((getWidth() - getPaddingRight()) - this.dividerWidth) - this.dividerMarginRight;
                    i2 = this.offsetsHolder.c;
                } else if (W) {
                    left = ((childAt2.getLeft() - ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) childAt2.getLayoutParams())).leftMargin) - this.dividerWidth) - this.dividerMarginRight;
                    i2 = this.offsetsHolder.c;
                } else {
                    right = childAt2.getRight() + ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) childAt2.getLayoutParams())).rightMargin + this.dividerMarginLeft;
                    i = this.offsetsHolder.c;
                }
                i3 = left - i2;
                drawVerticalDivider(canvas, i3);
            }
            right = getPaddingLeft() + this.dividerMarginLeft;
            i = this.offsetsHolder.c;
            i3 = right + i;
            drawVerticalDivider(canvas, i3);
        }
    }

    private final void drawDividersVertical(Canvas canvas) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8 && hasDividerBeforeChildAt(i)) {
                drawHorizontalDivider(canvas, (((childAt.getTop() - ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) childAt.getLayoutParams())).topMargin) - this.dividerHeight) - this.dividerMarginBottom) - getDividerOffsetBeforeChildAt(i));
            }
        }
        if (hasDividerBeforeChildAt(getChildCount())) {
            View childAt2 = getChildAt(getChildCount() - 1);
            drawHorizontalDivider(canvas, childAt2 != null ? childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) childAt2.getLayoutParams())).bottomMargin + this.dividerMarginTop + this.offsetsHolder.c : (((getHeight() - getPaddingBottom()) - this.dividerHeight) - this.dividerMarginBottom) - this.offsetsHolder.c);
        }
    }

    private final void drawHorizontalDivider(Canvas canvas, int top) {
        drawDivider(canvas, getPaddingLeft() + this.dividerMarginLeft, top, (getWidth() - getPaddingRight()) - this.dividerMarginRight, top + this.dividerHeight);
    }

    private final zy11 drawVerticalDivider(Canvas canvas, int left) {
        return drawDivider(canvas, left, getPaddingTop() + this.dividerMarginTop, left + this.dividerWidth, (getHeight() - getPaddingBottom()) - this.dividerMarginBottom);
    }

    private final void forEachSignificant(tls action) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                action.invoke(childAt);
            }
        }
    }

    private final void forEachSignificantIndexed(wls action) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                action.invoke(childAt, Integer.valueOf(i));
            }
        }
    }

    private final int gapBeforeChild(int i) {
        int dividerHeightWithMargins = isVertical() ? getDividerHeightWithMargins() : getDividerWidthWithMargins();
        if (hasDividerBeforeChildAt(i)) {
            return dividerHeightWithMargins;
        }
        if (i != this.firstVisibleChildIndex && i <= this.lastVisibleChildIndex) {
            return this.itemSpacingPx;
        }
        return 0;
    }

    private final int getDividerHeightWithMargins() {
        return this.dividerHeight + this.dividerMarginTop + this.dividerMarginBottom;
    }

    private final int getDividerOffsetBeforeChildAt(int index) {
        int i = this.firstVisibleChildIndex;
        hpl hplVar = this.offsetsHolder;
        return index == i ? hplVar.c : (int) (hplVar.b / 2.0f);
    }

    private final int getDividerWidthWithMargins() {
        return this.dividerWidth + this.dividerMarginRight + this.dividerMarginLeft;
    }

    private final float getFixedHorizontalWeight(DivLayoutParams divLayoutParams) {
        return getFixedWeight(divLayoutParams.getHorizontalWeight(), ((ViewGroup.MarginLayoutParams) divLayoutParams).width);
    }

    private final float getFixedVerticalWeight(DivLayoutParams divLayoutParams) {
        return getFixedWeight(divLayoutParams.getVerticalWeight(), ((ViewGroup.MarginLayoutParams) divLayoutParams).height);
    }

    private final float getFixedWeight(float weight, int size) {
        return weight > 0.0f ? weight : size == -1 ? 1.0f : 0.0f;
    }

    private final int getFreeSpace(int delta, int spec) {
        int i;
        if (delta >= 0 || (i = this.totalMatchParentLength) <= 0) {
            return (delta < 0 || !q5z.I(spec)) ? delta : delta + this.totalMatchParentLength;
        }
        int i2 = delta + i;
        if (i2 < 0) {
            return 0;
        }
        return i2;
    }

    private final int getMaxHeight(View view) {
        return ((DivLayoutParams) view.getLayoutParams()).getMaxHeight();
    }

    private final int getMaxLength(int current, int additional) {
        return Math.max(current, additional + current);
    }

    private final int getMaxWidth(View view) {
        return ((DivLayoutParams) view.getLayoutParams()).getMaxWidth();
    }

    public static /* synthetic */ void getOrientation$annotations() {
    }

    public static /* synthetic */ void getShowDividers$annotations() {
    }

    private final int getVisibleChildCount() {
        h8 h8Var = new h8(3, this);
        int i = 0;
        while (h8Var.hasNext()) {
            if (!(((View) h8Var.next()).getVisibility() == 8) && (i = i + 1) < 0) {
                scc.l();
                throw null;
            }
        }
        return i;
    }

    private final int getWidthSizeAndState(int measureSpec) {
        return View.resolveSizeAndState(Math.max(getSuggestedMinimumWidth(), this.totalLength), measureSpec, this.childMeasuredState);
    }

    private final boolean hasDividerBeforeChildAt(int childIndex) {
        if (childIndex == this.firstVisibleChildIndex) {
            return (getShowDividers() & 1) != 0;
        }
        if (childIndex > this.lastVisibleChildIndex) {
            return (getShowDividers() & 4) != 0;
        }
        if ((getShowDividers() & 2) != 0) {
            for (int i = childIndex - 1; -1 < i; i--) {
                if (getChildAt(i).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean hasSignificantDimension(int dimension, int parentMeasureSpec) {
        return (dimension == -1 && q5z.I(parentMeasureSpec)) ? false : true;
    }

    private final boolean hasSignificantHeight(View child, int heightMeasureSpec) {
        return hasSignificantDimension(((ViewGroup.MarginLayoutParams) ((DivLayoutParams) child.getLayoutParams())).height, heightMeasureSpec);
    }

    private final boolean hasSignificantWidth(View child, int widthMeasureSpec) {
        return hasSignificantDimension(((ViewGroup.MarginLayoutParams) ((DivLayoutParams) child.getLayoutParams())).width, widthMeasureSpec);
    }

    private final boolean isVertical() {
        return getOrientation() == 1;
    }

    private final void layoutHorizontal(int left, int top, int right, int bottom) {
        LinearContainerLayout linearContainerLayout;
        int i;
        int i2;
        int baseline;
        int verticalPaddings$div_release = (bottom - top) - getVerticalPaddings$div_release();
        int layoutDirection = getLayoutDirection();
        float f = (right - left) - this.totalLength;
        float paddingLeft = getPaddingLeft();
        this.offsetsHolder.a(f, Gravity.getAbsoluteGravity(getHorizontalGravity$div_release(), layoutDirection), getVisibleChildCount());
        float f2 = paddingLeft + this.offsetsHolder.a;
        b6w M = ffx.M(0, getChildCount(), this);
        int i3 = M.a;
        int i4 = M.b;
        int i5 = M.c;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return;
        }
        while (true) {
            View childAt = this.getChildAt(i3);
            if (childAt == null || childAt.getVisibility() == 8) {
                linearContainerLayout = this;
            } else {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                DivLayoutParams divLayoutParams = (DivLayoutParams) childAt.getLayoutParams();
                gpl gplVar = DivViewGroup.Companion;
                int gravity = divLayoutParams.getGravity();
                gplVar.getClass();
                int i6 = 1879048304 & gravity;
                if (i6 < 0) {
                    i6 = this.getVerticalGravity$div_release();
                }
                int paddingTop = this.getPaddingTop();
                if (i6 == 16) {
                    i = (((verticalPaddings$div_release - measuredHeight) + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin) / 2;
                } else if (i6 != 48) {
                    if (i6 != 80) {
                        i = 0;
                    } else {
                        i2 = verticalPaddings$div_release - measuredHeight;
                        baseline = ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin;
                        i = i2 - baseline;
                    }
                } else if (!divLayoutParams.getIsBaselineAligned() || ((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1 || childAt.getBaseline() == -1) {
                    i = ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin;
                } else {
                    i2 = this.maxBaselineAscent;
                    baseline = childAt.getBaseline();
                    i = i2 - baseline;
                }
                int i7 = paddingTop + i;
                float gapBeforeChild = f2 + this.gapBeforeChild(ffx.W(this) ? i3 + 1 : i3) + ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin;
                linearContainerLayout = this;
                linearContainerLayout.setChildFrame(childAt, m810.b(gapBeforeChild), i7, measuredWidth, measuredHeight);
                f2 = measuredWidth + ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin + linearContainerLayout.offsetsHolder.b + gapBeforeChild;
            }
            if (i3 == i4) {
                return;
            }
            i3 += i5;
            this = linearContainerLayout;
        }
    }

    private final void layoutVertical(int left, int top, int right, int bottom) {
        LinearContainerLayout linearContainerLayout;
        int horizontalPaddings$div_release = (right - left) - getHorizontalPaddings$div_release();
        float f = (bottom - top) - this.totalLength;
        float paddingTop = getPaddingTop();
        this.offsetsHolder.a(f, getVerticalGravity$div_release(), getVisibleChildCount());
        float f2 = paddingTop + this.offsetsHolder.a;
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = this.getChildAt(i);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                DivLayoutParams divLayoutParams = (DivLayoutParams) childAt.getLayoutParams();
                gpl gplVar = DivViewGroup.Companion;
                int gravity = divLayoutParams.getGravity();
                gplVar.getClass();
                int i2 = 125829127 & gravity;
                if (i2 < 0) {
                    i2 = this.getHorizontalGravity$div_release();
                }
                int layoutDirection = this.getLayoutDirection();
                int paddingLeft = this.getPaddingLeft();
                int absoluteGravity = Gravity.getAbsoluteGravity(i2, layoutDirection);
                int i3 = paddingLeft + (absoluteGravity != 1 ? absoluteGravity != 3 ? absoluteGravity != 5 ? ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin : (horizontalPaddings$div_release - measuredWidth) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin : (((horizontalPaddings$div_release - measuredWidth) + ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin) / 2);
                float gapBeforeChild = f2 + this.gapBeforeChild(i) + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin;
                linearContainerLayout = this;
                linearContainerLayout.setChildFrame(childAt, i3, m810.b(gapBeforeChild), measuredWidth, measuredHeight);
                f2 = measuredHeight + ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin + linearContainerLayout.offsetsHolder.b + gapBeforeChild;
            } else {
                linearContainerLayout = this;
            }
            i++;
            this = linearContainerLayout;
        }
    }

    private final void measureChildWithSignificantSizeHorizontal(View child, int widthMeasureSpec, int heightMeasureSpec) {
        LinearContainerLayout linearContainerLayout;
        View view;
        int i;
        if (!hasSignificantWidth(child, widthMeasureSpec)) {
            if (((ViewGroup.MarginLayoutParams) ((DivLayoutParams) child.getLayoutParams())).width == -1) {
                this.skippedMatchParentMinSizeLength = child.getMinimumWidth() + this.skippedMatchParentMinSizeLength;
                return;
            }
            return;
        }
        DivLayoutParams divLayoutParams = (DivLayoutParams) child.getLayoutParams();
        int i2 = ((ViewGroup.MarginLayoutParams) divLayoutParams).width;
        if (i2 == -3) {
            linearContainerLayout = this;
            view = child;
            i = heightMeasureSpec;
            linearContainerLayout.measureConstrainedWidthChildFirstTime(view, widthMeasureSpec, i);
        } else if (i2 != -1) {
            linearContainerLayout = this;
            view = child;
            i = heightMeasureSpec;
            linearContainerLayout.measureChildWithMargins(view, widthMeasureSpec, 0, i, 0);
        } else {
            linearContainerLayout = this;
            view = child;
            i = heightMeasureSpec;
            linearContainerLayout.measureMatchParentWidthChildFirstTime(view, widthMeasureSpec, i);
        }
        linearContainerLayout.childMeasuredState = View.combineMeasuredStates(linearContainerLayout.childMeasuredState, view.getMeasuredState());
        linearContainerLayout.updateMaxCrossSize(i, divLayoutParams.getVerticalMargins$div_release() + view.getMeasuredHeight());
        linearContainerLayout.updateBaselineOffset(view);
        linearContainerLayout.totalLength = linearContainerLayout.getMaxLength(linearContainerLayout.totalLength, divLayoutParams.getHorizontalMargins$div_release() + view.getMeasuredWidth());
    }

    private final void measureChildWithSignificantSizeVertical(View child, int widthMeasureSpec, int heightMeasureSpec) {
        DivLayoutParams divLayoutParams = (DivLayoutParams) child.getLayoutParams();
        boolean I = q5z.I(widthMeasureSpec);
        boolean hasSignificantHeight = hasSignificantHeight(child, heightMeasureSpec);
        boolean z = I ? hasSignificantHeight : ((ViewGroup.MarginLayoutParams) divLayoutParams).width != -1;
        if (((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1) {
            this.mainMatchParentChildren.add(child);
            this.matchParentSizes.add(emptySize);
        }
        if (z) {
            measureVerticalFirstTime(child, widthMeasureSpec, heightMeasureSpec, true, true);
            return;
        }
        if (!I) {
            this.crossMatchParentChildren.add(child);
        }
        if (hasSignificantHeight) {
            return;
        }
        this.skippedMatchParentChildren.add(child);
        this.totalLength = getMaxLength(this.totalLength, ((DivLayoutParams) child.getLayoutParams()).getVerticalMargins$div_release());
        this.skippedMatchParentMinSizeLength = child.getMinimumHeight() + this.skippedMatchParentMinSizeLength;
    }

    private final void measureConstrainedHeightChildFirstTime(View child, int widthMeasureSpec, int heightMeasureSpec, boolean considerHeight) {
        DivLayoutParams divLayoutParams = (DivLayoutParams) child.getLayoutParams();
        int maxHeight = divLayoutParams.getMaxHeight();
        ((ViewGroup.MarginLayoutParams) divLayoutParams).height = -2;
        divLayoutParams.setMaxHeight(Integer.MAX_VALUE);
        measureChildWithMargins(child, widthMeasureSpec, 0, heightMeasureSpec, 0);
        ((ViewGroup.MarginLayoutParams) divLayoutParams).height = -3;
        divLayoutParams.setMaxHeight(maxHeight);
        if (considerHeight) {
            this.totalConstrainedLength = getMaxLength(this.totalConstrainedLength, divLayoutParams.getVerticalMargins$div_release() + child.getMeasuredHeight());
            if (this.constrainedChildren.contains(child)) {
                return;
            }
            this.constrainedChildren.add(child);
        }
    }

    private final void measureConstrainedWidthChildFirstTime(View child, int widthMeasureSpec, int heightMeasureSpec) {
        DivLayoutParams divLayoutParams = (DivLayoutParams) child.getLayoutParams();
        int maxWidth = divLayoutParams.getMaxWidth();
        ((ViewGroup.MarginLayoutParams) divLayoutParams).width = -2;
        divLayoutParams.setMaxWidth(Integer.MAX_VALUE);
        measureChildWithMargins(child, widthMeasureSpec, 0, heightMeasureSpec, 0);
        ((ViewGroup.MarginLayoutParams) divLayoutParams).width = -3;
        divLayoutParams.setMaxWidth(maxWidth);
        this.totalConstrainedLength = getMaxLength(this.totalConstrainedLength, divLayoutParams.getHorizontalMargins$div_release() + child.getMeasuredWidth());
        this.constrainedChildren.add(child);
    }

    private final void measureHorizontal(int widthMeasureSpec, int heightMeasureSpec) {
        this.maxBaselineAscent = -1;
        this.maxBaselineDescent = -1;
        boolean I = q5z.I(widthMeasureSpec);
        if (getAspectRatio() != 0.0f) {
            heightMeasureSpec = I ? View.MeasureSpec.makeMeasureSpec(m810.b(View.MeasureSpec.getSize(widthMeasureSpec) / getAspectRatio()), 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 1073741824);
        }
        int size = View.MeasureSpec.getSize(heightMeasureSpec);
        boolean I2 = q5z.I(heightMeasureSpec);
        int max = I2 ? size : Math.max(getSuggestedMinimumHeight(), getVerticalPaddings$div_release());
        if (max < 0) {
            max = 0;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                this.totalLength += gapBeforeChild(i);
                this.totalWeight += getFixedHorizontalWeight((DivLayoutParams) childAt.getLayoutParams());
                if (((ViewGroup.MarginLayoutParams) ((DivLayoutParams) childAt.getLayoutParams())).width == -1) {
                    this.mainMatchParentChildren.add(childAt);
                    this.matchParentSizes.add(emptySize);
                }
                measureChildWithSignificantSizeHorizontal(childAt, widthMeasureSpec, heightMeasureSpec);
            }
        }
        int childCount2 = getChildCount();
        for (int i2 = 0; i2 < childCount2; i2++) {
            View childAt2 = getChildAt(i2);
            if (childAt2.getVisibility() != 8) {
                considerMatchParentChildMarginsInWidth(childAt2, widthMeasureSpec);
            }
        }
        int i3 = this.totalLength;
        if (i3 > 0) {
            this.totalLength = i3 + gapBeforeChild(getChildCount());
        }
        this.totalLength = getHorizontalPaddings$div_release() + this.totalLength;
        int widthSizeAndState = getWidthSizeAndState(widthMeasureSpec) & 16777215;
        if (!I && getAspectRatio() != 0.0f) {
            size = m810.b(widthSizeAndState / getAspectRatio());
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        }
        remeasureChildrenHorizontalIfNeeded(widthMeasureSpec, widthSizeAndState, heightMeasureSpec);
        if (!I2 && getAspectRatio() == 0.0f) {
            int childCount3 = getChildCount();
            for (int i4 = 0; i4 < childCount3; i4++) {
                View childAt3 = getChildAt(i4);
                if (childAt3.getVisibility() != 8) {
                    considerMatchParentChildInMaxHeight(childAt3, heightMeasureSpec, this.maxCrossSize == 0);
                }
            }
            this.maxCrossSize = Math.max(max, getVerticalPaddings$div_release() + this.maxCrossSize);
            int i5 = this.maxBaselineAscent;
            if (i5 != -1) {
                updateMaxCrossSize(heightMeasureSpec, i5 + this.maxBaselineDescent);
            }
            size = View.resolveSize(this.maxCrossSize, heightMeasureSpec);
        }
        int childCount4 = getChildCount();
        for (int i6 = 0; i6 < childCount4; i6++) {
            View childAt4 = getChildAt(i6);
            if (childAt4.getVisibility() != 8) {
                remeasureDynamicHeightChild(childAt4, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
            }
        }
        setMeasuredDimension(getWidthSizeAndState(widthMeasureSpec), View.resolveSizeAndState(size, heightMeasureSpec, this.childMeasuredState << 16));
    }

    private final void measureMatchParentHeightChildFirstTime(View child, int widthMeasureSpec, int heightMeasureSpec, boolean considerHeight) {
        if (q5z.I(heightMeasureSpec)) {
            measureChildWithMargins(child, widthMeasureSpec, 0, View.MeasureSpec.makeMeasureSpec(0, 1073741824), 0);
            if (considerHeight) {
                this.totalMatchParentLength = getMaxLength(this.totalMatchParentLength, child.getMeasuredHeight());
                return;
            }
            return;
        }
        DivLayoutParams divLayoutParams = (DivLayoutParams) child.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) divLayoutParams).height = -2;
        measureChildWithMargins(child, widthMeasureSpec, 0, heightMeasureSpec, 0);
        ((ViewGroup.MarginLayoutParams) divLayoutParams).height = -1;
        if (considerHeight) {
            this.totalMatchParentLength = getMaxLength(this.totalMatchParentLength, child.getMeasuredHeight());
        }
    }

    private final void measureMatchParentWidthChild(View child, int heightMeasureSpec) {
        if (hasSignificantHeight(child, heightMeasureSpec)) {
            measureVerticalFirstTime(child, View.MeasureSpec.makeMeasureSpec(this.maxCrossSize, 1073741824), heightMeasureSpec, false, true);
            this.skippedMatchParentChildren.remove(child);
        }
    }

    private final void measureMatchParentWidthChildFirstTime(View child, int widthMeasureSpec, int heightMeasureSpec) {
        DivLayoutParams divLayoutParams = (DivLayoutParams) child.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) divLayoutParams).width = -2;
        measureChildWithMargins(child, widthMeasureSpec, 0, heightMeasureSpec, 0);
        ((ViewGroup.MarginLayoutParams) divLayoutParams).width = -1;
        this.totalMatchParentLength = getMaxLength(this.totalMatchParentLength, divLayoutParams.getHorizontalMargins$div_release() + child.getMeasuredWidth());
    }

    private final void measureVertical(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        boolean z = View.MeasureSpec.getMode(widthMeasureSpec) == 1073741824;
        if (getAspectRatio() != 0.0f) {
            heightMeasureSpec = z ? View.MeasureSpec.makeMeasureSpec(m810.b(size / getAspectRatio()), 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 1073741824);
        }
        if (!z) {
            size = Math.max(getSuggestedMinimumWidth(), getHorizontalPaddings$div_release());
        }
        if (size < 0) {
            size = 0;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                this.totalLength += gapBeforeChild(i);
                this.totalWeight += getFixedVerticalWeight((DivLayoutParams) childAt.getLayoutParams());
                measureChildWithSignificantSizeVertical(childAt, widthMeasureSpec, heightMeasureSpec);
            }
        }
        considerMatchParentChildrenInMaxWidth(widthMeasureSpec, heightMeasureSpec);
        this.maxCrossSize = Math.max(size, getHorizontalPaddings$div_release() + this.maxCrossSize);
        Iterator<T> it = this.crossMatchParentChildren.iterator();
        while (it.hasNext()) {
            measureMatchParentWidthChild((View) it.next(), heightMeasureSpec);
        }
        int i2 = this.totalLength;
        if (i2 > 0) {
            this.totalLength = i2 + gapBeforeChild(getChildCount());
        }
        this.totalLength = getVerticalPaddings$div_release() + this.totalLength;
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        if (getAspectRatio() != 0.0f && !z) {
            size2 = m810.b((View.resolveSizeAndState(this.maxCrossSize, widthMeasureSpec, this.childMeasuredState) & 16777215) / getAspectRatio());
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            remeasureChildrenVerticalIfNeeded(widthMeasureSpec, size2, heightMeasureSpec, size);
        } else if (getAspectRatio() != 0.0f || q5z.I(heightMeasureSpec)) {
            remeasureChildrenVerticalIfNeeded(widthMeasureSpec, size2, heightMeasureSpec, size);
        } else {
            remeasureChildrenVerticalIfNeeded(widthMeasureSpec, Math.max(this.totalLength, getSuggestedMinimumHeight()), heightMeasureSpec, size);
            size2 = Math.max(this.totalLength, getSuggestedMinimumHeight());
        }
        setMeasuredDimension(View.resolveSizeAndState(this.maxCrossSize, widthMeasureSpec, this.childMeasuredState), View.resolveSizeAndState(size2, heightMeasureSpec, this.childMeasuredState << 16));
    }

    private final void measureVerticalFirstTime(View child, int widthMeasureSpec, int heightMeasureSpec, boolean considerWidth, boolean considerHeight) {
        LinearContainerLayout linearContainerLayout;
        View view;
        int i;
        DivLayoutParams divLayoutParams = (DivLayoutParams) child.getLayoutParams();
        int i2 = ((ViewGroup.MarginLayoutParams) divLayoutParams).height;
        if (i2 == -3) {
            linearContainerLayout = this;
            view = child;
            i = widthMeasureSpec;
            linearContainerLayout.measureConstrainedHeightChildFirstTime(view, i, heightMeasureSpec, considerHeight);
        } else if (i2 != -1) {
            linearContainerLayout = this;
            view = child;
            i = widthMeasureSpec;
            linearContainerLayout.measureChildWithMargins(view, i, 0, heightMeasureSpec, 0);
        } else {
            linearContainerLayout = this;
            view = child;
            i = widthMeasureSpec;
            linearContainerLayout.measureMatchParentHeightChildFirstTime(view, i, heightMeasureSpec, considerHeight);
        }
        linearContainerLayout.childMeasuredState = View.combineMeasuredStates(linearContainerLayout.childMeasuredState, view.getMeasuredState());
        if (considerWidth) {
            linearContainerLayout.updateMaxCrossSize(i, divLayoutParams.getHorizontalMargins$div_release() + view.getMeasuredWidth());
        }
        if (considerHeight) {
            linearContainerLayout.totalLength = linearContainerLayout.getMaxLength(linearContainerLayout.totalLength, divLayoutParams.getVerticalMargins$div_release() + view.getMeasuredHeight());
        }
    }

    private final boolean needRemeasureChildren(int delta, int spec) {
        if (!this.skippedMatchParentChildren.isEmpty()) {
            return true;
        }
        if (View.MeasureSpec.getMode(spec) == 0) {
            return false;
        }
        if (delta < 0) {
            if (this.totalConstrainedLength > 0 || this.totalWeight > 0.0f) {
                return true;
            }
        } else if (q5z.I(spec) && delta > 0 && this.totalWeight > 0.0f) {
            return true;
        }
        return false;
    }

    private final int remeasureChildHorizontal(View child, int heightMeasureSpec, int width) {
        DivLayoutParams divLayoutParams = (DivLayoutParams) child.getLayoutParams();
        gpl gplVar = DivViewGroup.Companion;
        int verticalMargins$div_release = divLayoutParams.getVerticalMargins$div_release() + getVerticalPaddings$div_release();
        int i = ((ViewGroup.MarginLayoutParams) divLayoutParams).height;
        int minimumHeight = child.getMinimumHeight();
        int maxHeight = divLayoutParams.getMaxHeight();
        gplVar.getClass();
        child.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), gpl.a(heightMeasureSpec, verticalMargins$div_release, i, minimumHeight, maxHeight));
        return View.combineMeasuredStates(this.childMeasuredState, child.getMeasuredState() & ModalContentViewContainer.BASE_SHADOW_COLOR);
    }

    private final void remeasureChildVertical(View child, int widthMeasureSpec, int maxWidth, int height) {
        DivLayoutParams divLayoutParams = (DivLayoutParams) child.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) divLayoutParams).width;
        if (i == -1) {
            if (maxWidth == 0) {
                ((ViewGroup.MarginLayoutParams) divLayoutParams).width = -3;
            } else {
                widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(maxWidth, 1073741824);
            }
        }
        gpl gplVar = DivViewGroup.Companion;
        int horizontalMargins$div_release = divLayoutParams.getHorizontalMargins$div_release() + getHorizontalPaddings$div_release();
        int i2 = ((ViewGroup.MarginLayoutParams) divLayoutParams).width;
        int minimumWidth = child.getMinimumWidth();
        int maxWidth2 = divLayoutParams.getMaxWidth();
        gplVar.getClass();
        int a2 = gpl.a(widthMeasureSpec, horizontalMargins$div_release, i2, minimumWidth, maxWidth2);
        ((ViewGroup.MarginLayoutParams) divLayoutParams).width = i;
        child.measure(a2, View.MeasureSpec.makeMeasureSpec(height, 1073741824));
        this.childMeasuredState = View.combineMeasuredStates(this.childMeasuredState, child.getMeasuredState() & (-256));
    }

    private final void remeasureChildrenHorizontalIfNeeded(int widthMeasureSpec, int widthSize, int heightMeasureSpec) {
        int i = (widthSize - this.totalLength) - this.skippedMatchParentMinSizeLength;
        List<View> list = this.constrainedChildren;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (getMaxWidth((View) it.next()) != Integer.MAX_VALUE) {
                    break;
                }
            }
        }
        if (!needRemeasureChildren(i, widthMeasureSpec)) {
            return;
        }
        this.totalLength = 0;
        remeasureConstrainedWidthChildren(widthMeasureSpec, heightMeasureSpec, i);
        remeasureMatchParentWidthChildren(widthMeasureSpec, heightMeasureSpec, i);
        int gapBeforeChild = this.totalLength + gapBeforeChild(getChildCount());
        this.totalLength = gapBeforeChild;
        this.totalLength = getHorizontalPaddings$div_release() + gapBeforeChild;
    }

    private final void remeasureChildrenVerticalIfNeeded(int widthMeasureSpec, int heightSize, int heightSpec, int initialMaxWidth) {
        int i = (heightSize - this.totalLength) - this.skippedMatchParentMinSizeLength;
        List<View> list = this.constrainedChildren;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (getMaxHeight((View) it.next()) != Integer.MAX_VALUE) {
                    break;
                }
            }
        }
        if (!needRemeasureChildren(i, heightSpec)) {
            return;
        }
        this.totalLength = 0;
        remeasureConstrainedHeightChildren(widthMeasureSpec, heightSpec, i);
        remeasureMatchParentHeightChildren(widthMeasureSpec, heightSpec, initialMaxWidth, i);
        int gapBeforeChild = this.totalLength + gapBeforeChild(getChildCount());
        this.totalLength = gapBeforeChild;
        this.totalLength = getVerticalPaddings$div_release() + gapBeforeChild;
    }

    private final void remeasureConstrainedHeightChildren(int widthMeasureSpec, int heightMeasureSpec, int delta) {
        int freeSpace = getFreeSpace(delta, heightMeasureSpec);
        List<View> list = this.constrainedChildren;
        if (freeSpace >= 0) {
            for (View view : list) {
                if (getMaxHeight(view) != Integer.MAX_VALUE) {
                    remeasureChildVertical(view, widthMeasureSpec, this.maxCrossSize, Math.min(view.getMeasuredHeight(), getMaxHeight(view)));
                }
            }
            return;
        }
        if (list.size() > 1) {
            xcc.q(list, new a());
        }
        for (View view2 : this.constrainedChildren) {
            DivLayoutParams divLayoutParams = (DivLayoutParams) view2.getLayoutParams();
            int measuredHeight = view2.getMeasuredHeight();
            int verticalMargins$div_release = divLayoutParams.getVerticalMargins$div_release() + measuredHeight;
            int b2 = m810.b((verticalMargins$div_release / this.totalConstrainedLength) * freeSpace) + measuredHeight;
            int minimumHeight = view2.getMinimumHeight();
            if (b2 < minimumHeight) {
                b2 = minimumHeight;
            }
            int maxHeight = divLayoutParams.getMaxHeight();
            if (b2 > maxHeight) {
                b2 = maxHeight;
            }
            remeasureChildVertical(view2, widthMeasureSpec, this.maxCrossSize, b2);
            this.childMeasuredState = View.combineMeasuredStates(this.childMeasuredState, view2.getMeasuredState() & 16777216);
            this.totalConstrainedLength -= verticalMargins$div_release;
            freeSpace -= view2.getMeasuredHeight() - measuredHeight;
        }
    }

    private final void remeasureConstrainedWidthChildren(int widthMeasureSpec, int heightMeasureSpec, int delta) {
        int freeSpace = getFreeSpace(delta, widthMeasureSpec);
        List<View> list = this.constrainedChildren;
        if (freeSpace >= 0) {
            for (View view : list) {
                if (getMaxWidth(view) != Integer.MAX_VALUE) {
                    remeasureChildHorizontal(view, heightMeasureSpec, Math.min(view.getMeasuredWidth(), getMaxWidth(view)));
                }
            }
            return;
        }
        if (list.size() > 1) {
            xcc.q(list, new b());
        }
        for (View view2 : this.constrainedChildren) {
            DivLayoutParams divLayoutParams = (DivLayoutParams) view2.getLayoutParams();
            int measuredWidth = view2.getMeasuredWidth();
            int horizontalMargins$div_release = divLayoutParams.getHorizontalMargins$div_release() + measuredWidth;
            int b2 = m810.b((horizontalMargins$div_release / this.totalConstrainedLength) * freeSpace) + measuredWidth;
            int minimumWidth = view2.getMinimumWidth();
            if (b2 < minimumWidth) {
                b2 = minimumWidth;
            }
            int maxWidth = divLayoutParams.getMaxWidth();
            if (b2 > maxWidth) {
                b2 = maxWidth;
            }
            remeasureChildHorizontal(view2, heightMeasureSpec, b2);
            this.childMeasuredState = View.combineMeasuredStates(this.childMeasuredState, view2.getMeasuredState() & 16777216);
            this.totalConstrainedLength -= horizontalMargins$div_release;
            freeSpace -= view2.getMeasuredWidth() - measuredWidth;
        }
    }

    private final void remeasureDynamicHeightChild(View child, int heightMeasureSpec) {
        int i = ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) child.getLayoutParams())).height;
        if (i == -1 || i == -3) {
            remeasureChildHorizontal(child, heightMeasureSpec, child.getMeasuredWidth());
        }
    }

    private final void remeasureMatchParentHeightChildren(int widthMeasureSpec, int heightMeasureSpec, int initialMaxWidth, int delta) {
        int i = this.maxCrossSize;
        this.maxCrossSize = 0;
        int freeSpace = getFreeSpace(delta, heightMeasureSpec);
        if (freeSpace > 0) {
            calculateMatchParentSizes(freeSpace, false);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                DivLayoutParams divLayoutParams = (DivLayoutParams) childAt.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1) {
                    if (freeSpace > 0) {
                        remeasureChildVertical(childAt, widthMeasureSpec, i, ((Number) this.matchParentSizes.get(this.mainMatchParentChildren.indexOf(childAt)).f()).intValue());
                    } else if (this.skippedMatchParentChildren.contains(childAt)) {
                        remeasureChildVertical(childAt, widthMeasureSpec, i, Math.max(childAt.getMinimumHeight(), 0));
                    }
                }
                updateMaxCrossSize(widthMeasureSpec, divLayoutParams.getHorizontalMargins$div_release() + childAt.getMeasuredWidth());
                int maxLength = getMaxLength(this.totalLength, divLayoutParams.getVerticalMargins$div_release() + childAt.getMeasuredHeight());
                this.totalLength = maxLength;
                this.totalLength = maxLength + gapBeforeChild(i2);
            }
        }
        this.maxCrossSize = Math.max(initialMaxWidth, getHorizontalPaddings$div_release() + this.maxCrossSize);
        q5z.d("Width of vertical container changed after remeasuring", Integer.valueOf(i), Integer.valueOf(this.maxCrossSize));
    }

    private final void remeasureMatchParentWidthChildren(int widthMeasureSpec, int heightMeasureSpec, int delta) {
        int freeSpace = getFreeSpace(delta, widthMeasureSpec);
        this.maxCrossSize = 0;
        this.maxBaselineAscent = -1;
        this.maxBaselineDescent = -1;
        if (freeSpace > 0) {
            calculateMatchParentSizes(freeSpace, true);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                DivLayoutParams divLayoutParams = (DivLayoutParams) childAt.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1) {
                    if (freeSpace > 0) {
                        remeasureChildHorizontal(childAt, heightMeasureSpec, ((Number) this.matchParentSizes.get(this.mainMatchParentChildren.indexOf(childAt)).f()).intValue());
                    } else {
                        remeasureChildHorizontal(childAt, heightMeasureSpec, Math.max(childAt.getMinimumWidth(), 0));
                    }
                }
                updateMaxCrossSize(heightMeasureSpec, divLayoutParams.getVerticalMargins$div_release() + childAt.getMeasuredHeight());
                int maxLength = getMaxLength(this.totalLength, divLayoutParams.getHorizontalMargins$div_release() + childAt.getMeasuredWidth());
                this.totalLength = maxLength;
                this.totalLength = maxLength + gapBeforeChild(i);
                updateBaselineOffset(childAt);
            }
        }
    }

    private final void setChildFrame(View child, int left, int top, int width, int height) {
        child.layout(left, top, width + left, height + top);
    }

    private final void updateBaselineOffset(View child) {
        int baseline;
        DivLayoutParams divLayoutParams = (DivLayoutParams) child.getLayoutParams();
        if (divLayoutParams.getIsBaselineAligned() && (baseline = child.getBaseline()) != -1) {
            this.maxBaselineAscent = Math.max(this.maxBaselineAscent, ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin + baseline);
            this.maxBaselineDescent = Math.max(this.maxBaselineDescent, (child.getMeasuredHeight() - baseline) - ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin);
        }
    }

    private final void updateMaxCrossSize(int measureSpec, int childSize) {
        if (q5z.I(measureSpec)) {
            return;
        }
        this.maxCrossSize = Math.max(this.maxCrossSize, childSize);
    }

    @Override // com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup
    public DivLayoutParams generateDefaultLayoutParams() {
        return isVertical() ? new DivLayoutParams(-1, -2) : new DivLayoutParams(-2, -2);
    }

    public float getAspectRatio() {
        return ((Number) this.aspectRatio.getValue(this, $$delegatedProperties[1])).floatValue();
    }

    @Override // android.view.View
    public int getBaseline() {
        if (!isVertical()) {
            int i = this.maxBaselineAscent;
            return i != -1 ? getPaddingTop() + i : super.getBaseline();
        }
        View childAt = getChildAt(0);
        if (childAt == null) {
            return super.getBaseline();
        }
        return getPaddingTop() + childAt.getBaseline() + ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) childAt.getLayoutParams())).topMargin;
    }

    public final Drawable getDividerDrawable() {
        return this.dividerDrawable;
    }

    public final int getOrientation() {
        return ((Number) this.orientation.getValue(this, $$delegatedProperties[0])).intValue();
    }

    public final int getShowDividers() {
        return ((Number) this.showDividers.getValue(this, $$delegatedProperties[2])).intValue();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.dividerDrawable == null) {
            return;
        }
        if (isVertical()) {
            drawDividersVertical(canvas);
        } else {
            drawDividersHorizontal(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b2) {
        if (isVertical()) {
            layoutVertical(l, t, r, b2);
        } else {
            layoutHorizontal(l, t, r, b2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        r8.firstVisibleChildIndex = r2;
        r1 = new defpackage.h8(3, r8);
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r1.hasNext() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        r3 = r1.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (r2 < 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (((android.view.View) r3).getVisibility() != 8) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r3 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        r4 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        defpackage.scc.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
    
        r8.lastVisibleChildIndex = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        if (isVertical() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
    
        measureVertical(r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
    
        r8.constrainedChildren.clear();
        r8.crossMatchParentChildren.clear();
        r8.skippedMatchParentChildren.clear();
        r8.mainMatchParentChildren.clear();
        r8.matchParentSizes.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0074, code lost:
    
        measureHorizontal(r9, r10);
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        this.totalLength = 0;
        this.maxCrossSize = 0;
        this.totalConstrainedLength = 0;
        this.totalMatchParentLength = 0;
        this.skippedMatchParentMinSizeLength = 0;
        this.totalWeight = 0.0f;
        this.childMeasuredState = 0;
        h8 h8Var = new h8(3, this);
        int i = 0;
        while (true) {
            int i2 = -1;
            if (!h8Var.hasNext()) {
                i = -1;
                break;
            }
            Object next = h8Var.next();
            if (i < 0) {
                scc.m();
                throw null;
            }
            if (!(((View) next).getVisibility() == 8)) {
                break;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.y83
    public void setAspectRatio(float f) {
        this.aspectRatio.setValue(this, $$delegatedProperties[1], Float.valueOf(f));
    }

    public final void setDividerDrawable(Drawable drawable) {
        if (jl40.l(this.dividerDrawable, drawable)) {
            return;
        }
        this.dividerDrawable = drawable;
        this.dividerWidth = drawable != null ? drawable.getIntrinsicWidth() : 0;
        this.dividerHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public final void setDividerMargins(int left, int top, int right, int bottom) {
        this.dividerMarginLeft = left;
        this.dividerMarginRight = right;
        this.dividerMarginTop = top;
        this.dividerMarginBottom = bottom;
        requestLayout();
    }

    public final void setItemSpacing(int px) {
        if (this.itemSpacingPx != px) {
            this.itemSpacingPx = px;
            requestLayout();
        }
    }

    public final void setOrientation(int i) {
        this.orientation.setValue(this, $$delegatedProperties[0], Integer.valueOf(i));
    }

    public final void setShowDividers(int i) {
        this.showDividers.setValue(this, $$delegatedProperties[2], Integer.valueOf(i));
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearContainerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ LinearContainerLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public LinearContainerLayout(Context context) {
        this(context, null, 0, 6, null);
    }
}
