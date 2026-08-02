package com.apollographql.apollo3.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import com.apollographql.apollo3.exception.ApolloException;
import defpackage.bvf0;
import defpackage.bx40;
import defpackage.cvu0;
import defpackage.cx40;
import defpackage.ern;
import defpackage.evu0;
import defpackage.hvu;
import defpackage.jci0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qq6;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.wls;
import defpackage.xfo;
import defpackage.xvu;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import okio.ByteString;
import ru.CryptoPro.JCP.VMInspector.OpenList;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lqq6;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {1, 5, 1})
@mvg(c = "com.apollographql.apollo3.internal.MultipartKt$multipartBodyFlow$1", f = "multipart.kt", l = {28}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class MultipartKt$multipartBodyFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ Ref$ObjectRef<cx40> $multipartReader;
    final /* synthetic */ xvu $response;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultipartKt$multipartBodyFlow$1(Ref$ObjectRef ref$ObjectRef, xvu xvuVar, Continuation continuation) {
        super(2, continuation);
        this.$multipartReader = ref$ObjectRef;
        this.$response = xvuVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MultipartKt$multipartBodyFlow$1 multipartKt$multipartBodyFlow$1 = new MultipartKt$multipartBodyFlow$1(this.$multipartReader, this.$response, continuation);
        multipartKt$multipartBodyFlow$1.L$0 = obj;
        return multipartKt$multipartBodyFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MultipartKt$multipartBodyFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a8  */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, cx40] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        vpr vprVar;
        Object obj2;
        String str2;
        ern ernVar;
        jci0 jci0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            vpr vprVar2 = (vpr) this.L$0;
            Ref$ObjectRef<cx40> ref$ObjectRef = this.$multipartReader;
            xvu xvuVar = this.$response;
            qq6 qq6Var = xvuVar.c;
            String c0 = bvf0.c0(xvuVar.b);
            if (c0 != null) {
                List Y = evu0.Y(c0, new char[]{';'}, 0, 6);
                ArrayList arrayList = new ArrayList(tcc.n(Y, 10));
                Iterator it = Y.iterator();
                while (it.hasNext()) {
                    arrayList.add(evu0.k0((String) it.next()).toString());
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (cvu0.x((String) obj2, "boundary=", false)) {
                        break;
                    }
                }
                String str3 = (String) obj2;
                if (str3 != null && (str2 = (String) kotlin.collections.a.S(1, evu0.Y(str3, new char[]{'='}, 0, 6))) != null) {
                    str = evu0.l0(str2, OpenList.CHAR_QUOTE, '\'');
                    if (str != null) {
                        throw new ApolloException("Expected the Content-Type to have a boundary parameter", 2);
                    }
                    ref$ObjectRef.element = new cx40(qq6Var, str);
                    vprVar = vprVar2;
                }
            }
            str = null;
            if (str != null) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$0;
            b.b(obj);
        }
        do {
            cx40 cx40Var = this.$multipartReader.element;
            ByteString byteString = cx40Var.b;
            qq6 qq6Var2 = cx40Var.a;
            if (cx40Var.x) {
                ny61.r("closed");
                return null;
            }
            if (!cx40Var.y) {
                if (cx40Var.w == 0 && qq6Var2.Q(0L, byteString)) {
                    qq6Var2.skip(byteString.h());
                } else {
                    while (true) {
                        long a = cx40Var.a(PlaybackStateCompat.ACTION_PLAY_FROM_URI);
                        if (a == 0) {
                            break;
                        }
                        qq6Var2.skip(a);
                    }
                    qq6Var2.skip(cx40Var.c.h());
                }
                boolean z = false;
                while (true) {
                    int h0 = qq6Var2.h0(cx40Var.A);
                    if (h0 == -1) {
                        throw new ApolloException("unexpected characters after boundary", 2);
                    }
                    if (h0 != 0) {
                        if (h0 == 1) {
                            cx40Var.w++;
                            ArrayList arrayList2 = new ArrayList();
                            while (true) {
                                String w1 = qq6Var2.w1();
                                if (w1.length() == 0) {
                                    bx40 bx40Var = new bx40(cx40Var);
                                    cx40Var.z = bx40Var;
                                    ernVar = new ern(new jci0(bx40Var));
                                    break;
                                }
                                int G = evu0.G(w1, ':', 0, 6);
                                if (G == -1) {
                                    xfo.g("Unexpected header: ".concat(w1));
                                    return null;
                                }
                                arrayList2.add(new hvu(evu0.k0(w1.substring(0, G)).toString(), evu0.k0(w1.substring(G + 1)).toString()));
                            }
                        } else if (h0 != 2) {
                            if (h0 == 3 || h0 == 4) {
                                z = true;
                            }
                        } else {
                            if (z) {
                                throw new ApolloException("unexpected characters after boundary", 2);
                            }
                            if (cx40Var.w == 0) {
                                throw new ApolloException("expected at least 1 part", 2);
                            }
                            cx40Var.y = true;
                        }
                    } else {
                        if (cx40Var.w == 0) {
                            throw new ApolloException("expected at least 1 part", 2);
                        }
                        cx40Var.y = true;
                    }
                }
            }
            ernVar = null;
            if (ernVar == null) {
                return zy11.a;
            }
            jci0Var = (jci0) ernVar.b;
            this.L$0 = vprVar;
            this.label = 1;
        } while (vprVar.emit(jci0Var, this) != coroutineSingletons);
        return coroutineSingletons;
    }
}
