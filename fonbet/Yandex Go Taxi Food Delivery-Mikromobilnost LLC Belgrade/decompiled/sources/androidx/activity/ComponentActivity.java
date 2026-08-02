package androidx.activity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.core.app.n;
import androidx.core.app.t0;
import androidx.core.app.u0;
import androidx.core.app.y0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.c0;
import androidx.lifecycle.g0;
import androidx.lifecycle.q;
import androidx.lifecycle.t;
import defpackage.an10;
import defpackage.b170;
import defpackage.bbh0;
import defpackage.blj;
import defpackage.csf0;
import defpackage.cy60;
import defpackage.e9e;
import defpackage.ffx;
import defpackage.g2m0;
import defpackage.gs31;
import defpackage.h2m0;
import defpackage.hjh0;
import defpackage.hs31;
import defpackage.hx60;
import defpackage.i2m0;
import defpackage.i3y;
import defpackage.iy2;
import defpackage.j2m0;
import defpackage.j750;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.jzz0;
import defpackage.k0d;
import defpackage.k2m0;
import defpackage.k750;
import defpackage.kls;
import defpackage.lje;
import defpackage.m0d;
import defpackage.m50;
import defpackage.ncs;
import defpackage.nx40;
import defpackage.ny61;
import defpackage.o0d;
import defpackage.p0d;
import defpackage.pey;
import defpackage.q0d;
import defpackage.q7u;
import defpackage.qs31;
import defpackage.qx60;
import defpackage.r0d;
import defpackage.rk10;
import defpackage.rs31;
import defpackage.rx60;
import defpackage.rzo;
import defpackage.s0d;
import defpackage.s8o;
import defpackage.sls;
import defpackage.t50;
import defpackage.tk10;
import defpackage.u0d;
import defpackage.u40;
import defpackage.v40;
import defpackage.vng;
import defpackage.x40;
import defpackage.x50;
import defpackage.xx60;
import defpackage.y8f;
import defpackage.ym11;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000ü\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 å\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\u00022\u00020\r2\u00020\u000e2\u00020\u00022\u00020\u000f2\u00020\u0002:\bæ\u0001\u0098\u0001ç\u0001è\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011B\u0013\b\u0017\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\u0019\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0015H\u0015¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u001e\u0010\u001dJ\u0019\u0010 \u001a\u00020\u00172\b\b\u0001\u0010\u001f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010\u0014J\u0019\u0010 \u001a\u00020\u00172\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b \u0010#J#\u0010 \u001a\u00020\u00172\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b \u0010&J#\u0010'\u001a\u00020\u00172\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b'\u0010&J\u000f\u0010(\u001a\u00020\u0017H\u0017¢\u0006\u0004\b(\u0010\u0011J\u0011\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\u00172\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\u00172\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b0\u0010/J)\u00105\u001a\u0002042\u0006\u00101\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b5\u00106J\u001f\u00107\u001a\u0002042\u0006\u00101\u001a\u00020\u00122\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b7\u00108J\u001f\u0010;\u001a\u0002042\u0006\u00101\u001a\u00020\u00122\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u001f\u0010=\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u00122\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\u00172\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u001f\u0010A\u001a\u00020\u00172\u0006\u0010@\u001a\u00020?2\u0006\u0010C\u001a\u00020\u0003H\u0016¢\u0006\u0004\bA\u0010DJ'\u0010A\u001a\u00020\u00172\u0006\u0010@\u001a\u00020?2\u0006\u0010C\u001a\u00020\u00032\u0006\u0010F\u001a\u00020EH\u0017¢\u0006\u0004\bA\u0010GJ\u0017\u0010H\u001a\u00020\u00172\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bH\u0010BJ\u000f\u0010I\u001a\u00020\u0017H\u0016¢\u0006\u0004\bI\u0010\u0011J\u000f\u0010J\u001a\u00020\u0017H\u0017¢\u0006\u0004\bJ\u0010\u0011J\u001f\u0010N\u001a\u00020\u00172\u0006\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020\u0012H\u0017¢\u0006\u0004\bN\u0010OJ)\u0010N\u001a\u00020\u00172\u0006\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020\u00122\b\u0010P\u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0004\bN\u0010QJA\u0010W\u001a\u00020\u00172\u0006\u0010L\u001a\u00020R2\u0006\u0010M\u001a\u00020\u00122\b\u0010S\u001a\u0004\u0018\u00010K2\u0006\u0010T\u001a\u00020\u00122\u0006\u0010U\u001a\u00020\u00122\u0006\u0010V\u001a\u00020\u0012H\u0017¢\u0006\u0004\bW\u0010XJK\u0010W\u001a\u00020\u00172\u0006\u0010L\u001a\u00020R2\u0006\u0010M\u001a\u00020\u00122\b\u0010S\u001a\u0004\u0018\u00010K2\u0006\u0010T\u001a\u00020\u00122\u0006\u0010U\u001a\u00020\u00122\u0006\u0010V\u001a\u00020\u00122\b\u0010P\u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0004\bW\u0010YJ)\u0010\\\u001a\u00020\u00172\u0006\u0010M\u001a\u00020\u00122\u0006\u0010Z\u001a\u00020\u00122\b\u0010[\u001a\u0004\u0018\u00010KH\u0015¢\u0006\u0004\b\\\u0010]J-\u0010c\u001a\u00020\u00172\u0006\u0010M\u001a\u00020\u00122\f\u0010`\u001a\b\u0012\u0004\u0012\u00020_0^2\u0006\u0010b\u001a\u00020aH\u0017¢\u0006\u0004\bc\u0010dJI\u0010n\u001a\b\u0012\u0004\u0012\u00028\u00000m\"\u0004\b\u0000\u0010e\"\u0004\b\u0001\u0010f2\u0012\u0010h\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010g2\u0006\u0010j\u001a\u00020i2\f\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00010k¢\u0006\u0004\bn\u0010oJA\u0010n\u001a\b\u0012\u0004\u0012\u00028\u00000m\"\u0004\b\u0000\u0010e\"\u0004\b\u0001\u0010f2\u0012\u0010h\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010g2\f\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00010k¢\u0006\u0004\bn\u0010pJ\u0017\u0010s\u001a\u00020\u00172\u0006\u0010r\u001a\u00020qH\u0017¢\u0006\u0004\bs\u0010tJ\u001b\u0010v\u001a\u00020\u00172\f\u0010-\u001a\b\u0012\u0004\u0012\u00020q0u¢\u0006\u0004\bv\u0010wJ\u001b\u0010x\u001a\u00020\u00172\f\u0010-\u001a\b\u0012\u0004\u0012\u00020q0u¢\u0006\u0004\bx\u0010wJ\u0017\u0010z\u001a\u00020\u00172\u0006\u0010y\u001a\u00020\u0012H\u0017¢\u0006\u0004\bz\u0010\u0014J\u001b\u0010{\u001a\u00020\u00172\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00120u¢\u0006\u0004\b{\u0010wJ\u001b\u0010|\u001a\u00020\u00172\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00120u¢\u0006\u0004\b|\u0010wJ\u0017\u0010}\u001a\u00020\u00172\u0006\u0010L\u001a\u00020KH\u0015¢\u0006\u0004\b}\u0010~J\u001b\u0010\u007f\u001a\u00020\u00172\f\u0010-\u001a\b\u0012\u0004\u0012\u00020K0u¢\u0006\u0004\b\u007f\u0010wJ\u001d\u0010\u0080\u0001\u001a\u00020\u00172\f\u0010-\u001a\b\u0012\u0004\u0012\u00020K0u¢\u0006\u0005\b\u0080\u0001\u0010wJ\u001b\u0010\u0082\u0001\u001a\u00020\u00172\u0007\u0010\u0081\u0001\u001a\u000204H\u0017¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J#\u0010\u0082\u0001\u001a\u00020\u00172\u0007\u0010\u0081\u0001\u001a\u0002042\u0006\u0010r\u001a\u00020qH\u0017¢\u0006\u0006\b\u0082\u0001\u0010\u0084\u0001J\u001e\u0010\u0086\u0001\u001a\u00020\u00172\r\u0010-\u001a\t\u0012\u0005\u0012\u00030\u0085\u00010u¢\u0006\u0005\b\u0086\u0001\u0010wJ\u001e\u0010\u0087\u0001\u001a\u00020\u00172\r\u0010-\u001a\t\u0012\u0005\u0012\u00030\u0085\u00010u¢\u0006\u0005\b\u0087\u0001\u0010wJ\u001b\u0010\u0089\u0001\u001a\u00020\u00172\u0007\u0010\u0088\u0001\u001a\u000204H\u0017¢\u0006\u0006\b\u0089\u0001\u0010\u0083\u0001J#\u0010\u0089\u0001\u001a\u00020\u00172\u0007\u0010\u0088\u0001\u001a\u0002042\u0006\u0010r\u001a\u00020qH\u0017¢\u0006\u0006\b\u0089\u0001\u0010\u0084\u0001J\u001e\u0010\u008b\u0001\u001a\u00020\u00172\r\u0010-\u001a\t\u0012\u0005\u0012\u00030\u008a\u00010u¢\u0006\u0005\b\u008b\u0001\u0010wJ\u001e\u0010\u008c\u0001\u001a\u00020\u00172\r\u0010-\u001a\t\u0012\u0005\u0012\u00030\u008a\u00010u¢\u0006\u0005\b\u008c\u0001\u0010wJ\u0011\u0010\u008d\u0001\u001a\u00020\u0017H\u0015¢\u0006\u0005\b\u008d\u0001\u0010\u0011J\u0019\u0010\u008f\u0001\u001a\u00020\u00172\u0007\u0010-\u001a\u00030\u008e\u0001¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u0019\u0010\u0091\u0001\u001a\u00020\u00172\u0007\u0010-\u001a\u00030\u008e\u0001¢\u0006\u0006\b\u0091\u0001\u0010\u0090\u0001J\u0011\u0010\u0092\u0001\u001a\u00020\u0017H\u0016¢\u0006\u0005\b\u0092\u0001\u0010\u0011J\u0011\u0010\u0093\u0001\u001a\u00020\u0017H\u0002¢\u0006\u0005\b\u0093\u0001\u0010\u0011J\u001c\u0010\u0096\u0001\u001a\u00020\u00172\b\u0010\u0095\u0001\u001a\u00030\u0094\u0001H\u0003¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u0013\u0010\u0099\u0001\u001a\u00030\u0098\u0001H\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0018\u0010\u009c\u0001\u001a\u00030\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0018\u0010\u009f\u0001\u001a\u00030\u009e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001f\u0010¢\u0001\u001a\u00030¡\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b¢\u0001\u0010£\u0001\u0012\u0005\b¤\u0001\u0010\u0011R\u001c\u0010¦\u0001\u001a\u0005\u0018\u00010¥\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u0018\u0010¨\u0001\u001a\u00030\u0098\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R!\u0010¯\u0001\u001a\u00030ª\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010eR\u0018\u0010±\u0001\u001a\u00030°\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u001c\u0010³\u0001\u001a\u00020i8\u0006¢\u0006\u0010\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001R$\u0010¸\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020q0u0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R$\u0010º\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120u0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010¹\u0001R$\u0010»\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0u0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¹\u0001R%\u0010¼\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0085\u00010u0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010¹\u0001R%\u0010½\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008a\u00010u0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¹\u0001R\u001f\u0010¾\u0001\u001a\n\u0012\u0005\u0012\u00030\u008e\u00010·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¹\u0001R\u0019\u0010¿\u0001\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001R\u0019\u0010Á\u0001\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010À\u0001R!\u0010Æ\u0001\u001a\u00030Â\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÃ\u0001\u0010¬\u0001\u001a\u0006\bÄ\u0001\u0010Å\u0001R!\u0010Ë\u0001\u001a\u00030Ç\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÈ\u0001\u0010¬\u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001R!\u0010Ï\u0001\u001a\u00030\u0094\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\bÌ\u0001\u0010¬\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001R\u0018\u0010Ñ\u0001\u001a\u0004\u0018\u00010\u00028WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÐ\u0001\u0010\u001dR\u0018\u0010Õ\u0001\u001a\u00030Ò\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÓ\u0001\u0010Ô\u0001R\u0018\u0010Ø\u0001\u001a\u00030¥\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÖ\u0001\u0010×\u0001R\u0018\u0010Ü\u0001\u001a\u00030Ù\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bÚ\u0001\u0010Û\u0001R\u0018\u0010à\u0001\u001a\u00030Ý\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÞ\u0001\u0010ß\u0001R\u0015\u0010ä\u0001\u001a\u00030á\u00018F¢\u0006\b\u001a\u0006\bâ\u0001\u0010ã\u0001¨\u0006é\u0001"}, d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/core/app/ComponentActivity;", "", "Lpey;", "Lrs31;", "Lq7u;", "Lj2m0;", "Lrx60;", "Lk750;", "Lx50;", "Lv40;", "Lxx60;", "Lb170;", "Landroidx/core/app/t0;", "Landroidx/core/app/u0;", "Lrk10;", "<init>", "()V", "", "contentLayoutId", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "onRetainNonConfigurationInstance", "()Ljava/lang/Object;", "onRetainCustomNonConfigurationInstance", "layoutResID", "setContentView", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "initializeViewTreeOwners", "Landroid/content/Context;", "peekAvailableContext", "()Landroid/content/Context;", "Lcy60;", "listener", "addOnContextAvailableListener", "(Lcy60;)V", "removeOnContextAvailableListener", "featureId", "Landroid/view/Menu;", "menu", "", "onPreparePanel", "(ILandroid/view/View;Landroid/view/Menu;)Z", "onCreatePanelMenu", "(ILandroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onMenuItemSelected", "(ILandroid/view/MenuItem;)Z", "onPanelClosed", "(ILandroid/view/Menu;)V", "Lan10;", "provider", "addMenuProvider", "(Lan10;)V", "owner", "(Lan10;Lpey;)V", "Landroidx/lifecycle/Lifecycle$State;", ClidProvider.STATE, "(Lan10;Lpey;Landroidx/lifecycle/Lifecycle$State;)V", "removeMenuProvider", "invalidateMenu", "onBackPressed", "Landroid/content/Intent;", "intent", "requestCode", "startActivityForResult", "(Landroid/content/Intent;I)V", "options", "(Landroid/content/Intent;ILandroid/os/Bundle;)V", "Landroid/content/IntentSender;", "fillInIntent", "flagsMask", "flagsValues", "extraFlags", "startIntentSenderForResult", "(Landroid/content/IntentSender;ILandroid/content/Intent;III)V", "(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V", "resultCode", Constants.KEY_DATA, "onActivityResult", "(IILandroid/content/Intent;)V", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", CA20Status.STATUS_USER_I, "O", "Lx40;", "contract", "Lt50;", "registry", "Lu40;", "callback", "Lm50;", "registerForActivityResult", "(Lx40;Lt50;Lu40;)Lm50;", "(Lx40;Lu40;)Lm50;", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Le9e;", "addOnConfigurationChangedListener", "(Le9e;)V", "removeOnConfigurationChangedListener", "level", "onTrimMemory", "addOnTrimMemoryListener", "removeOnTrimMemoryListener", "onNewIntent", "(Landroid/content/Intent;)V", "addOnNewIntentListener", "removeOnNewIntentListener", "isInMultiWindowMode", "onMultiWindowModeChanged", "(Z)V", "(ZLandroid/content/res/Configuration;)V", "Landroidx/core/app/n;", "addOnMultiWindowModeChangedListener", "removeOnMultiWindowModeChangedListener", "isInPictureInPictureMode", "onPictureInPictureModeChanged", "Landroidx/core/app/y0;", "addOnPictureInPictureModeChangedListener", "removeOnPictureInPictureModeChangedListener", "onUserLeaveHint", "Ljava/lang/Runnable;", "addOnUserLeaveHintListener", "(Ljava/lang/Runnable;)V", "removeOnUserLeaveHintListener", "reportFullyDrawn", "ensureViewModelStore", "Lqx60;", "dispatcher", "addObserverForBackInvoker", "(Lqx60;)V", "Ls0d;", "createFullyDrawnExecutor", "()Ls0d;", "Llje;", "contextAwareHelper", "Llje;", "Ltk10;", "menuHostHelper", "Ltk10;", "Lh2m0;", "savedStateRegistryController", "Lh2m0;", "getSavedStateRegistryController$annotations", "Lqs31;", "_viewModelStore", "Lqs31;", "reportFullyDrawnExecutor", "Ls0d;", "Lkls;", "fullyDrawnReporter$delegate", "Li3y;", "getFullyDrawnReporter", "()Lkls;", "fullyDrawnReporter", "Ljava/util/concurrent/atomic/AtomicInteger;", "nextLocalRequestCode", "Ljava/util/concurrent/atomic/AtomicInteger;", "activityResultRegistry", "Lt50;", "getActivityResultRegistry", "()Lt50;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onConfigurationChangedListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onTrimMemoryListeners", "onNewIntentListeners", "onMultiWindowModeChangedListeners", "onPictureInPictureModeChangedListeners", "onUserLeaveHintListeners", "dispatchingOnMultiWindowModeChanged", "Z", "dispatchingOnPictureInPictureModeChanged", "Lblj;", "onBackPressedInput$delegate", "getOnBackPressedInput", "()Lblj;", "onBackPressedInput", "Lhs31;", "defaultViewModelProviderFactory$delegate", "getDefaultViewModelProviderFactory", "()Lhs31;", "defaultViewModelProviderFactory", "onBackPressedDispatcher$delegate", "getOnBackPressedDispatcher", "()Lqx60;", "onBackPressedDispatcher", "getLastCustomNonConfigurationInstance", "lastCustomNonConfigurationInstance", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "getViewModelStore", "()Lqs31;", "viewModelStore", "Ly8f;", "getDefaultViewModelCreationExtras", "()Ly8f;", "defaultViewModelCreationExtras", "Lj750;", "getNavigationEventDispatcher", "()Lj750;", "navigationEventDispatcher", "Lg2m0;", "getSavedStateRegistry", "()Lg2m0;", "savedStateRegistry", "Companion", "a", "ReportFullyDrawnExecutorImpl", "r0d", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements rs31, q7u, j2m0, rx60, k750, x50, v40, xx60, b170, t0, u0, rk10 {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final r0d Companion = new r0d();
    private qs31 _viewModelStore;
    private final t50 activityResultRegistry;
    private int contentLayoutId;
    private final lje contextAwareHelper;

    /* renamed from: defaultViewModelProviderFactory$delegate, reason: from kotlin metadata */
    private final i3y defaultViewModelProviderFactory;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;

    /* renamed from: fullyDrawnReporter$delegate, reason: from kotlin metadata */
    private final i3y fullyDrawnReporter;
    private final tk10 menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;

    /* renamed from: onBackPressedDispatcher$delegate, reason: from kotlin metadata */
    private final i3y onBackPressedDispatcher;

    /* renamed from: onBackPressedInput$delegate, reason: from kotlin metadata */
    private final i3y onBackPressedInput;
    private final CopyOnWriteArrayList<e9e> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<e9e> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<e9e> onNewIntentListeners;
    private final CopyOnWriteArrayList<e9e> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<e9e> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final s0d reportFullyDrawnExecutor;
    private final h2m0 savedStateRegistryController;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\fR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u000fR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutorImpl;", "Ls0d;", "Landroid/view/ViewTreeObserver$OnDrawListener;", "Ljava/lang/Runnable;", "<init>", "(Landroidx/activity/ComponentActivity;)V", "Landroid/view/View;", "view", "Lzy11;", "viewCreated", "(Landroid/view/View;)V", "activityDestroyed", "()V", "runnable", "execute", "(Ljava/lang/Runnable;)V", "onDraw", "run", "", "endWatchTimeMillis", "J", "getEndWatchTimeMillis", "()J", "currentRunnable", "Ljava/lang/Runnable;", "getCurrentRunnable", "()Ljava/lang/Runnable;", "setCurrentRunnable", "", "onDrawScheduled", "Z", "getOnDrawScheduled", "()Z", "setOnDrawScheduled", "(Z)V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class ReportFullyDrawnExecutorImpl implements s0d, ViewTreeObserver.OnDrawListener, Runnable {
        private Runnable currentRunnable;
        private final long endWatchTimeMillis = SystemClock.uptimeMillis() + 10000;
        private boolean onDrawScheduled;

        public ReportFullyDrawnExecutorImpl() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void execute$lambda$0(ReportFullyDrawnExecutorImpl reportFullyDrawnExecutorImpl) {
            Runnable runnable = reportFullyDrawnExecutorImpl.currentRunnable;
            if (runnable != null) {
                runnable.run();
                reportFullyDrawnExecutorImpl.currentRunnable = null;
            }
        }

        @Override // defpackage.s0d
        public void activityDestroyed() {
            ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.currentRunnable = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            if (!this.onDrawScheduled) {
                decorView.postOnAnimation(new Runnable() { // from class: androidx.activity.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.ReportFullyDrawnExecutorImpl.execute$lambda$0(ComponentActivity.ReportFullyDrawnExecutorImpl.this);
                    }
                });
            } else if (jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        public final Runnable getCurrentRunnable() {
            return this.currentRunnable;
        }

        public final long getEndWatchTimeMillis() {
            return this.endWatchTimeMillis;
        }

        public final boolean getOnDrawScheduled() {
            return this.onDrawScheduled;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            boolean z;
            Runnable runnable = this.currentRunnable;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.endWatchTimeMillis) {
                    this.onDrawScheduled = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.currentRunnable = null;
            kls fullyDrawnReporter = ComponentActivity.this.getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.b) {
                z = fullyDrawnReporter.c;
            }
            if (z) {
                this.onDrawScheduled = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        public final void setCurrentRunnable(Runnable runnable) {
            this.currentRunnable = runnable;
        }

        public final void setOnDrawScheduled(boolean z) {
            this.onDrawScheduled = z;
        }

        @Override // defpackage.s0d
        public void viewCreated(View view) {
            if (this.onDrawScheduled) {
                return;
            }
            this.onDrawScheduled = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    public static final class a {
        public Object a;
        public qs31 b;
    }

    public ComponentActivity() {
        this.contextAwareHelper = new lje();
        final int i = 1;
        this.menuHostHelper = new tk10(new k0d(this, i));
        i2m0 i2m0Var = new i2m0(this, new csf0(20, this));
        this.savedStateRegistryController = new h2m0(i2m0Var);
        this.reportFullyDrawnExecutor = createFullyDrawnExecutor();
        this.fullyDrawnReporter = kotlin.a.a(new m0d(this, i));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new u0d(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        this.onBackPressedInput = kotlin.a.a(new m0d(this, 2));
        if (getLifecycle() == null) {
            ny61.r("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        final int i2 = 0;
        getLifecycle().a(new q(this) { // from class: n0d
            public final /* synthetic */ ComponentActivity b;

            {
                this.b = this;
            }

            @Override // androidx.lifecycle.q
            public final void M1(pey peyVar, Lifecycle.Event event) {
                int i3 = i2;
                ComponentActivity componentActivity = this.b;
                switch (i3) {
                    case 0:
                        ComponentActivity._init_$lambda$1(componentActivity, peyVar, event);
                        break;
                    default:
                        ComponentActivity._init_$lambda$2(componentActivity, peyVar, event);
                        break;
                }
            }
        });
        getLifecycle().a(new q(this) { // from class: n0d
            public final /* synthetic */ ComponentActivity b;

            {
                this.b = this;
            }

            @Override // androidx.lifecycle.q
            public final void M1(pey peyVar, Lifecycle.Event event) {
                int i3 = i;
                ComponentActivity componentActivity = this.b;
                switch (i3) {
                    case 0:
                        ComponentActivity._init_$lambda$1(componentActivity, peyVar, event);
                        break;
                    default:
                        ComponentActivity._init_$lambda$2(componentActivity, peyVar, event);
                        break;
                }
            }
        });
        getLifecycle().a(new q0d(this));
        i2m0Var.a();
        g0.b(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new o0d(i2, this));
        addOnContextAvailableListener(new p0d(this, i2));
        this.defaultViewModelProviderFactory = kotlin.a.a(new m0d(this, 3));
        this.onBackPressedDispatcher = kotlin.a.a(new m0d(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ComponentActivity componentActivity, pey peyVar, Lifecycle.Event event) {
        Window window;
        View peekDecorView;
        if (event != Lifecycle.Event.ON_STOP || (window = componentActivity.getWindow()) == null || (peekDecorView = window.peekDecorView()) == null) {
            return;
        }
        peekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ComponentActivity componentActivity, pey peyVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            componentActivity.contextAwareHelper.b = null;
            if (!componentActivity.isChangingConfigurations()) {
                componentActivity.getViewModelStore().a();
            }
            componentActivity.reportFullyDrawnExecutor.activityDestroyed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle _init_$lambda$3(ComponentActivity componentActivity) {
        Bundle bundle = new Bundle();
        t50 t50Var = componentActivity.activityResultRegistry;
        t50Var.getClass();
        LinkedHashMap linkedHashMap = t50Var.b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(t50Var.d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(t50Var.g));
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(ComponentActivity componentActivity, Context context) {
        Bundle a2 = componentActivity.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a2 != null) {
            t50 t50Var = componentActivity.activityResultRegistry;
            LinkedHashMap linkedHashMap = t50Var.b;
            LinkedHashMap linkedHashMap2 = t50Var.a;
            Bundle bundle = t50Var.g;
            ArrayList<Integer> integerArrayList = a2.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a2.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = a2.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                t50Var.d.addAll(stringArrayList2);
            }
            Bundle bundle2 = a2.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        ym11.c(linkedHashMap2).remove(num);
                    }
                }
                int intValue = integerArrayList.get(i).intValue();
                String str2 = stringArrayList.get(i);
                linkedHashMap2.put(Integer.valueOf(intValue), str2);
                t50Var.b.put(str2, Integer.valueOf(intValue));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addObserverForBackInvoker(final qx60 dispatcher) {
        getLifecycle().a(new q(this) { // from class: l0d
            public final /* synthetic */ ComponentActivity b;

            {
                this.b = this;
            }

            @Override // androidx.lifecycle.q
            public final void M1(pey peyVar, Lifecycle.Event event) {
                ComponentActivity.addObserverForBackInvoker$lambda$0(dispatcher, this.b, peyVar, event);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addObserverForBackInvoker$lambda$0(qx60 qx60Var, ComponentActivity componentActivity, pey peyVar, Lifecycle.Event event) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (event == Lifecycle.Event.ON_CREATE) {
            onBackInvokedDispatcher = componentActivity.getOnBackInvokedDispatcher();
            j750 j750Var = qx60Var.b;
            j750Var.c(new hx60(onBackInvokedDispatcher, 0), 1);
            j750Var.c(new hx60(onBackInvokedDispatcher, 1000000), 0);
        }
    }

    private final s0d createFullyDrawnExecutor() {
        return new ReportFullyDrawnExecutorImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k2m0 defaultViewModelProviderFactory_delegate$lambda$0(ComponentActivity componentActivity) {
        return new k2m0(componentActivity.getApplication(), componentActivity, componentActivity.getIntent() != null ? componentActivity.getIntent().getExtras() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureViewModelStore() {
        if (this._viewModelStore == null) {
            a aVar = (a) getLastNonConfigurationInstance();
            if (aVar != null) {
                this._viewModelStore = aVar.b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new qs31();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kls fullyDrawnReporter_delegate$lambda$0(ComponentActivity componentActivity) {
        return new kls(componentActivity.reportFullyDrawnExecutor, new m0d(componentActivity, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 fullyDrawnReporter_delegate$lambda$0$0(ComponentActivity componentActivity) {
        componentActivity.reportFullyDrawn();
        return zy11.a;
    }

    private final blj getOnBackPressedInput() {
        return (blj) this.onBackPressedInput.getValue();
    }

    private static /* synthetic */ void getSavedStateRegistryController$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qx60 onBackPressedDispatcher_delegate$lambda$0(ComponentActivity componentActivity) {
        qx60 qx60Var = new qx60(new k0d(componentActivity, 0));
        if (Build.VERSION.SDK_INT >= 33) {
            if (!jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new iy2(4, componentActivity, qx60Var));
                return qx60Var;
            }
            componentActivity.addObserverForBackInvoker(qx60Var);
        }
        return qx60Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBackPressedDispatcher_delegate$lambda$0$0(ComponentActivity componentActivity) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!jl40.l(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!jl40.l(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final blj onBackPressedInput_delegate$lambda$0(ComponentActivity componentActivity) {
        blj bljVar = new blj();
        componentActivity.getNavigationEventDispatcher().b(bljVar);
        return bljVar;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        initializeViewTreeOwners();
        this.reportFullyDrawnExecutor.viewCreated(getWindow().getDecorView());
        super.addContentView(view, params);
    }

    @Override // defpackage.rk10
    public void addMenuProvider(an10 provider) {
        tk10 tk10Var = this.menuHostHelper;
        tk10Var.b.add(provider);
        tk10Var.a.run();
    }

    @Override // defpackage.xx60
    public final void addOnConfigurationChangedListener(e9e listener) {
        this.onConfigurationChangedListeners.add(listener);
    }

    public final void addOnContextAvailableListener(cy60 listener) {
        lje ljeVar = this.contextAwareHelper;
        ComponentActivity componentActivity = ljeVar.b;
        if (componentActivity != null) {
            listener.a(componentActivity);
        }
        ljeVar.a.add(listener);
    }

    @Override // androidx.core.app.t0
    public final void addOnMultiWindowModeChangedListener(e9e listener) {
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final void addOnNewIntentListener(e9e listener) {
        this.onNewIntentListeners.add(listener);
    }

    @Override // androidx.core.app.u0
    public final void addOnPictureInPictureModeChangedListener(e9e listener) {
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // defpackage.b170
    public final void addOnTrimMemoryListener(e9e listener) {
        this.onTrimMemoryListeners.add(listener);
    }

    public final void addOnUserLeaveHintListener(Runnable listener) {
        this.onUserLeaveHintListeners.add(listener);
    }

    @Override // defpackage.x50
    public final t50 getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // defpackage.q7u
    public y8f getDefaultViewModelCreationExtras() {
        nx40 nx40Var = new nx40(0);
        if (getApplication() != null) {
            nx40Var.b(gs31.x, getApplication());
        }
        nx40Var.b(g0.a, this);
        nx40Var.b(g0.b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            nx40Var.b(g0.c, extras);
        }
        return nx40Var;
    }

    @Override // defpackage.q7u
    public hs31 getDefaultViewModelProviderFactory() {
        return (hs31) this.defaultViewModelProviderFactory.getValue();
    }

    public kls getFullyDrawnReporter() {
        return (kls) this.fullyDrawnReporter.getValue();
    }

    @jxi
    public Object getLastCustomNonConfigurationInstance() {
        a aVar = (a) getLastNonConfigurationInstance();
        if (aVar != null) {
            return aVar.a;
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, defpackage.pey
    public Lifecycle getLifecycle() {
        return super.getLifecycle();
    }

    @Override // defpackage.k750
    public j750 getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().b;
    }

    @Override // defpackage.rx60
    public final qx60 getOnBackPressedDispatcher() {
        return (qx60) this.onBackPressedDispatcher.getValue();
    }

    @Override // defpackage.j2m0
    public final g2m0 getSavedStateRegistry() {
        return this.savedStateRegistryController.b;
    }

    @Override // defpackage.rs31
    public qs31 getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this._viewModelStore;
        }
        ny61.r("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        return null;
    }

    public void initializeViewTreeOwners() {
        vng.E(getWindow().getDecorView(), this);
        rzo.T(getWindow().getDecorView(), this);
        s8o.R(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(hjh0.view_tree_on_back_pressed_dispatcher_owner, this);
        getWindow().getDecorView().setTag(hjh0.report_drawn, this);
        getWindow().getDecorView().setTag(bbh0.view_tree_navigation_event_dispatcher_owner, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @jxi
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (this.activityResultRegistry.a(requestCode, resultCode, data)) {
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // android.app.Activity
    @jxi
    public void onBackPressed() {
        getOnBackPressedInput().a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Iterator<e9e> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        this.savedStateRegistryController.a(savedInstanceState);
        lje ljeVar = this.contextAwareHelper;
        ljeVar.b = this;
        Iterator it = ljeVar.a.iterator();
        while (it.hasNext()) {
            ((cy60) it.next()).a(this);
        }
        super.onCreate(savedInstanceState);
        ReportFragment.Companion.getClass();
        c0.b(this);
        int i = this.contentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        if (featureId != 0) {
            return true;
        }
        super.onCreatePanelMenu(featureId, menu);
        tk10 tk10Var = this.menuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = tk10Var.b.iterator();
        while (it.hasNext()) {
            ((ncs) ((an10) it.next())).a.k(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        if (super.onMenuItemSelected(featureId, item)) {
            return true;
        }
        if (featureId == 0) {
            return this.menuHostHelper.c(item);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode, Configuration newConfig) {
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(isInMultiWindowMode, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<e9e> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new n(isInMultiWindowMode, 0));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator<e9e> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int featureId, Menu menu) {
        Iterator it = this.menuHostHelper.b.iterator();
        while (it.hasNext()) {
            ((ncs) ((an10) it.next())).a.q(menu);
        }
        super.onPanelClosed(featureId, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, Configuration newConfig) {
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<e9e> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new y0(isInPictureInPictureMode, 0));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        if (featureId != 0) {
            return true;
        }
        super.onPreparePanel(featureId, view, menu);
        Iterator it = this.menuHostHelper.b.iterator();
        while (it.hasNext()) {
            ((ncs) ((an10) it.next())).a.t(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    @jxi
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        if (this.activityResultRegistry.a(requestCode, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @jxi
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        a aVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        qs31 qs31Var = this._viewModelStore;
        if (qs31Var == null && (aVar = (a) getLastNonConfigurationInstance()) != null) {
            qs31Var = aVar.b;
        }
        if (qs31Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        a aVar2 = new a();
        aVar2.a = onRetainCustomNonConfigurationInstance;
        aVar2.b = qs31Var;
        return aVar2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        if (getLifecycle() instanceof t) {
            ((t) getLifecycle()).i(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.b(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        Iterator<e9e> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(level));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.b;
    }

    public final <I, O> m50 registerForActivityResult(x40 contract, t50 registry, u40 callback) {
        return registry.d("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // defpackage.rk10
    public void removeMenuProvider(an10 provider) {
        this.menuHostHelper.d(provider);
    }

    @Override // defpackage.xx60
    public final void removeOnConfigurationChangedListener(e9e listener) {
        this.onConfigurationChangedListeners.remove(listener);
    }

    public final void removeOnContextAvailableListener(cy60 listener) {
        this.contextAwareHelper.a.remove(listener);
    }

    @Override // androidx.core.app.t0
    public final void removeOnMultiWindowModeChangedListener(e9e listener) {
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    public final void removeOnNewIntentListener(e9e listener) {
        this.onNewIntentListeners.remove(listener);
    }

    @Override // androidx.core.app.u0
    public final void removeOnPictureInPictureModeChangedListener(e9e listener) {
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // defpackage.b170
    public final void removeOnTrimMemoryListener(e9e listener) {
        this.onTrimMemoryListeners.remove(listener);
    }

    public final void removeOnUserLeaveHintListener(Runnable listener) {
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (jzz0.a()) {
                Trace.beginSection(ffx.f0("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            kls fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.b) {
                try {
                    fullyDrawnReporter.c = true;
                    Iterator it = fullyDrawnReporter.d.iterator();
                    while (it.hasNext()) {
                        ((sls) it.next()).invoke();
                    }
                    fullyDrawnReporter.d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int layoutResID) {
        initializeViewTreeOwners();
        this.reportFullyDrawnExecutor.viewCreated(getWindow().getDecorView());
        super.setContentView(layoutResID);
    }

    @Override // android.app.Activity
    @jxi
    public void startActivityForResult(Intent intent, int requestCode) {
        super.startActivityForResult(intent, requestCode);
    }

    @Override // android.app.Activity
    @jxi
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    @Override // android.app.Activity
    @jxi
    public void startActivityForResult(Intent intent, int requestCode, Bundle options) {
        super.startActivityForResult(intent, requestCode, options);
    }

    @Override // android.app.Activity
    @jxi
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    public void addMenuProvider(an10 provider, pey owner) {
        this.menuHostHelper.a(provider, owner);
    }

    public void addMenuProvider(an10 provider, pey owner, Lifecycle.State state) {
        this.menuHostHelper.b(provider, owner, state);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        this.reportFullyDrawnExecutor.viewCreated(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        initializeViewTreeOwners();
        this.reportFullyDrawnExecutor.viewCreated(getWindow().getDecorView());
        super.setContentView(view, params);
    }

    @Override // defpackage.v40
    public final <I, O> m50 registerForActivityResult(x40 contract, u40 callback) {
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override // android.app.Activity
    @jxi
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<e9e> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new n(isInMultiWindowMode));
        }
    }

    @Override // android.app.Activity
    @jxi
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<e9e> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new y0(isInPictureInPictureMode));
        }
    }

    public ComponentActivity(int i) {
        this();
        this.contentLayoutId = i;
    }
}
