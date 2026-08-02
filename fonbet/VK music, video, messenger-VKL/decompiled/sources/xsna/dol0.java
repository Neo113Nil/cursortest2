package xsna;

import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.groups.dto.GroupsMarketInfoDto;
import com.vk.api.generated.market.dto.MarketCountersFilterDto;
import com.vk.api.generated.market.dto.MarketCurrencyDto;
import com.vk.api.generated.market.dto.MarketGetAlbumsResponseDto;
import com.vk.api.generated.market.dto.MarketGetCountersResponseDto;
import com.vk.api.generated.market.dto.MarketGetEditUrlResponseDto;
import com.vk.api.generated.market.dto.MarketGetEditUrlTypeDto;
import com.vk.api.generated.market.dto.MarketGetServicesResponseDto;
import com.vk.api.generated.market.dto.MarketGetServicesSectionResponseDto;
import com.vk.api.generated.market.dto.MarketSearchResponseDto;
import com.vk.api.generated.market.dto.MarketSearchServicesRevDto;
import com.vk.api.generated.market.dto.MarketSearchServicesSortDto;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.storefrontservices.impl.StorefrontServicesArgs;
import com.vk.ecomm.storefrontservices.impl.presentation.feature.LoadingState;
import com.vk.ecomm.storefrontservices.impl.presentation.feature.ServicesSort;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.xqu;

/* compiled from: StorefrontServicesInteractor.kt */
/* loaded from: classes18.dex */
public final class dol0 {
    public final StorefrontServicesArgs a;
    public final boolean b;
    public final UserId c;
    public final Integer d;
    public final boolean e;
    public final String f;
    public final fol0 g;
    public final boolean h;

    public dol0(StorefrontServicesArgs storefrontServicesArgs, boolean z, jnl0 jnl0Var) {
        this.a = storefrontServicesArgs;
        this.b = z;
        this.c = storefrontServicesArgs.b;
        Integer num = storefrontServicesArgs.c;
        this.d = num;
        boolean z2 = storefrontServicesArgs.f;
        this.e = z2;
        String str = storefrontServicesArgs.d;
        this.f = str;
        this.g = new fol0((q530) jnl0Var.a.getValue());
        this.h = num == null && str == null && !z2;
    }

    public static Integer k(Integer num) {
        if (num != null) {
            if (num.intValue() < 0) {
                num = null;
            }
            if (num != null) {
                long intValue = num.intValue() * 100;
                if (intValue > 2147483647L) {
                    intValue = 2147483647L;
                }
                return Integer.valueOf((int) intValue);
            }
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:23|24))(2:25|(1:27)(2:28|(1:30)))|12|(1:14)|15|16|(1:21)(2:18|19)))|33|6|7|(0)(0)|12|(0)|15|16|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0030, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        r8 = new kotlin.Result.Failure(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:11:0x002c, B:12:0x0065, B:14:0x006d, B:15:0x0071, B:28:0x0043), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(Integer num, ContinuationImpl continuationImpl) {
        tnl0 tnl0Var;
        int i;
        if (continuationImpl instanceof tnl0) {
            tnl0Var = (tnl0) continuationImpl;
            int i2 = tnl0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tnl0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = tnl0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tnl0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (!this.h) {
                        return null;
                    }
                    iz2 A = yfb.A(new yd10().f(Collections.singletonList(MarketCountersFilterDto.BOOKMARK_ITEMS_COUNT)));
                    tnl0Var.L$0 = num;
                    tnl0Var.L$1 = null;
                    tnl0Var.I$0 = 0;
                    tnl0Var.label = 1;
                    obj = evj.p(A, tnl0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    num = (Integer) tnl0Var.L$0;
                    kotlin.a.a(obj);
                }
                Integer d = ((MarketGetCountersResponseDto) obj).d();
                Serializable failure = new Integer(d != null ? d.intValue() : 0);
                return !(failure instanceof Result.Failure) ? num : failure;
            }
        }
        tnl0Var = new tnl0(this, continuationImpl);
        Object obj2 = tnl0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tnl0Var.label;
        if (i != 0) {
        }
        Integer d2 = ((MarketGetCountersResponseDto) obj2).d();
        Serializable failure2 = new Integer(d2 != null ? d2.intValue() : 0);
        if (!(failure2 instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i, ContinuationImpl continuationImpl) {
        unl0 unl0Var;
        int i2;
        dol0 dol0Var;
        int i3;
        try {
            if (continuationImpl instanceof unl0) {
                unl0Var = (unl0) continuationImpl;
                int i4 = unl0Var.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    unl0Var.label = i4 - Integer.MIN_VALUE;
                    Object obj = unl0Var.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = unl0Var.label;
                    if (i2 != 0) {
                        kotlin.a.a(obj);
                        boolean z = this.h;
                        boolean z2 = this.e;
                        int i5 = ((z && i == 0) || z2) ? 1 : 0;
                        if (i5 == 0) {
                            return null;
                        }
                        int i6 = z2 ? 20 : this.b ? 6 : 4;
                        UserId userId = this.c;
                        Integer num = new Integer(i);
                        Integer num2 = new Integer(i6);
                        tfx tfxVar = new tfx("market.getServicesAlbums", new lr(20), new pn(23));
                        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
                        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num.intValue(), 0, 0, 8);
                        tfxVar.f(num2.intValue(), 0, 100, "count");
                        iz2 A = yfb.A(tfxVar);
                        unl0Var.L$0 = this;
                        unl0Var.I$0 = i;
                        unl0Var.I$1 = i5;
                        unl0Var.I$2 = i6;
                        unl0Var.I$3 = 0;
                        unl0Var.label = 1;
                        obj = evj.p(A, unl0Var);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        dol0Var = this;
                        i3 = i6;
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i3 = unl0Var.I$2;
                        dol0Var = (dol0) unl0Var.L$0;
                        kotlin.a.a(obj);
                    }
                    fol0 fol0Var = dol0Var.g;
                    boolean z3 = dol0Var.e;
                    fol0Var.getClass();
                    return fol0.a((MarketGetAlbumsResponseDto) obj, z3, i3);
                }
            }
            if (i2 != 0) {
            }
            fol0 fol0Var2 = dol0Var.g;
            boolean z32 = dol0Var.e;
            fol0Var2.getClass();
            return fol0.a((MarketGetAlbumsResponseDto) obj, z32, i3);
        } catch (Throwable th) {
            Throwable a = Result.a(new Result.Failure(th));
            if (a != null) {
                return new Result.Failure(a);
            }
            throw new KotlinNothingValueException();
        }
        unl0Var = new unl0(this, continuationImpl);
        Object obj2 = unl0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = unl0Var.label;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:20|21))(2:22|(1:29)(2:26|(1:28)))|12|13|(1:18)(2:15|16)))|33|6|7|(0)(0)|12|13|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002c, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        r7 = new kotlin.Result.Failure(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(ContinuationImpl continuationImpl) {
        vnl0 vnl0Var;
        int i;
        Serializable failure;
        if (continuationImpl instanceof vnl0) {
            vnl0Var = (vnl0) continuationImpl;
            int i2 = vnl0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vnl0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = vnl0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = vnl0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (this.e || this.d != null) {
                        return null;
                    }
                    iz2 A = yfb.A(new yd10().w(this.c, MarketGetEditUrlTypeDto.MARKET_SERVICES));
                    vnl0Var.L$0 = null;
                    vnl0Var.I$0 = 0;
                    vnl0Var.label = 1;
                    obj = evj.p(A, vnl0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                failure = ((MarketGetEditUrlResponseDto) obj).getUrl();
                if (failure instanceof Result.Failure) {
                    return failure;
                }
                return null;
            }
        }
        vnl0Var = new vnl0(this, continuationImpl);
        Object obj2 = vnl0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = vnl0Var.label;
        if (i != 0) {
        }
        failure = ((MarketGetEditUrlResponseDto) obj2).getUrl();
        if (failure instanceof Result.Failure) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i, ContinuationImpl continuationImpl) {
        wnl0 wnl0Var;
        int i2;
        if (continuationImpl instanceof wnl0) {
            wnl0Var = (wnl0) continuationImpl;
            int i3 = wnl0Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wnl0Var.label = i3 - Integer.MIN_VALUE;
                Object obj = wnl0Var.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = wnl0Var.label;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                wnl0Var.I$0 = i;
                wnl0Var.label = 1;
                Object b = b(i, wnl0Var);
                return b == obj2 ? obj2 : b;
            }
        }
        wnl0Var = new wnl0(this, continuationImpl);
        Object obj3 = wnl0Var.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = wnl0Var.label;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(int i, ContinuationImpl continuationImpl) {
        xnl0 xnl0Var;
        int i2;
        if (continuationImpl instanceof xnl0) {
            xnl0Var = (xnl0) continuationImpl;
            int i3 = xnl0Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xnl0Var.label = i3 - Integer.MIN_VALUE;
                Object obj = xnl0Var.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = xnl0Var.label;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                xnl0Var.I$0 = i;
                xnl0Var.label = 1;
                Object f = f(i, xnl0Var);
                return f == obj2 ? obj2 : f;
            }
        }
        xnl0Var = new xnl0(this, continuationImpl);
        Object obj3 = xnl0Var.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = xnl0Var.label;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008b, code lost:
    
        if (r12 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(int i, ContinuationImpl continuationImpl) {
        ynl0 ynl0Var;
        int i2;
        try {
            if (continuationImpl instanceof ynl0) {
                ynl0Var = (ynl0) continuationImpl;
                int i3 = ynl0Var.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    ynl0Var.label = i3 - Integer.MIN_VALUE;
                    Object obj = ynl0Var.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = ynl0Var.label;
                    if (i2 != 0) {
                        kotlin.a.a(obj);
                        if (this.e) {
                            return null;
                        }
                        String str = this.f;
                        if (str != null) {
                            ynl0Var.I$0 = i;
                            ynl0Var.label = 1;
                            Object g = g(str, i, ynl0Var);
                            if (g != obj2) {
                                return g;
                            }
                        } else {
                            int i4 = this.b ? 6 : 4;
                            iz2 A = yfb.A(new yd10().F(this.c, this.d, new Integer(i4), new Integer(20), new Integer(i)));
                            ynl0Var.I$0 = i;
                            ynl0Var.I$1 = i4;
                            ynl0Var.label = 2;
                            obj = evj.p(A, ynl0Var);
                        }
                        return obj2;
                    }
                    if (i2 == 1) {
                        kotlin.a.a(obj);
                        return ((Result) obj).d();
                    }
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return this.g.c((MarketGetServicesResponseDto) obj);
                }
            }
            if (i2 != 0) {
            }
            return this.g.c((MarketGetServicesResponseDto) obj);
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        ynl0Var = new ynl0(this, continuationImpl);
        Object obj3 = ynl0Var.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = ynl0Var.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, int i, ContinuationImpl continuationImpl) {
        znl0 znl0Var;
        int i2;
        try {
            if (continuationImpl instanceof znl0) {
                znl0Var = (znl0) continuationImpl;
                int i3 = znl0Var.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    znl0Var.label = i3 - Integer.MIN_VALUE;
                    Object obj = znl0Var.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = znl0Var.label;
                    if (i2 != 0) {
                        kotlin.a.a(obj);
                        UserId userId = this.c;
                        Integer num = new Integer(20);
                        Integer num2 = new Integer(i);
                        tfx tfxVar = new tfx("market.getServicesSection", new as(20), new p11(18));
                        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
                        tfx.o(tfxVar, "section_id", str, 0, 0, 12);
                        tfxVar.f(num.intValue(), 0, 200, "count");
                        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num2.intValue(), 0, 0, 8);
                        iz2 A = yfb.A(tfxVar);
                        znl0Var.L$0 = null;
                        znl0Var.I$0 = i;
                        znl0Var.label = 1;
                        obj = evj.p(A, znl0Var);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                    }
                    return this.g.d((MarketGetServicesSectionResponseDto) obj);
                }
            }
            if (i2 != 0) {
            }
            return this.g.d((MarketGetServicesSectionResponseDto) obj);
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        znl0Var = new znl0(this, continuationImpl);
        Object obj2 = znl0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = znl0Var.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x008a, code lost:
    
        if (r11 != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007f, code lost:
    
        if (r11 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ContinuationImpl continuationImpl) {
        aol0 aol0Var;
        int i;
        Object f;
        Object obj;
        Object b;
        StorefrontServicesArgs storefrontServicesArgs;
        Object obj2;
        LoadingState loadingState;
        Object a;
        String str;
        Object obj3;
        LoadingState loadingState2;
        Object obj4;
        StorefrontServicesArgs storefrontServicesArgs2;
        Object obj5;
        if (continuationImpl instanceof aol0) {
            aol0Var = (aol0) continuationImpl;
            int i2 = aol0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aol0Var.label = i2 - Integer.MIN_VALUE;
                Object obj6 = aol0Var.result;
                Object obj7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aol0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj6);
                    aol0Var.label = 1;
                    f = f(0, aol0Var);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            obj = aol0Var.L$0;
                            kotlin.a.a(obj6);
                            b = ((Result) obj6).d();
                            LoadingState loadingState3 = obj instanceof Result.Failure ? LoadingState.Error : b instanceof Result.Failure ? LoadingState.Error : LoadingState.None;
                            aol0Var.L$0 = obj;
                            aol0Var.L$1 = b;
                            aol0Var.L$2 = loadingState3;
                            storefrontServicesArgs = this.a;
                            aol0Var.L$3 = storefrontServicesArgs;
                            aol0Var.label = 3;
                            Object c = c(aol0Var);
                            if (c != obj7) {
                                LoadingState loadingState4 = loadingState3;
                                obj2 = b;
                                obj6 = c;
                                loadingState = loadingState4;
                                String str2 = (String) obj6;
                                Integer num = new Integer(0);
                                aol0Var.L$0 = obj;
                                aol0Var.L$1 = obj2;
                                aol0Var.L$2 = loadingState;
                                aol0Var.L$3 = storefrontServicesArgs;
                                aol0Var.L$4 = str2;
                                aol0Var.label = 4;
                                a = a(num, aol0Var);
                                if (a != obj7) {
                                }
                            }
                            return obj7;
                        }
                        if (i != 3) {
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str = (String) aol0Var.L$4;
                            StorefrontServicesArgs storefrontServicesArgs3 = (StorefrontServicesArgs) aol0Var.L$3;
                            LoadingState loadingState5 = (LoadingState) aol0Var.L$2;
                            obj4 = aol0Var.L$1;
                            obj3 = aol0Var.L$0;
                            kotlin.a.a(obj6);
                            loadingState2 = loadingState5;
                            storefrontServicesArgs2 = storefrontServicesArgs3;
                            obj5 = obj4;
                            y7p0 y7p0Var = new y7p0(str, (Integer) obj6);
                            if (obj5 instanceof Result.Failure) {
                                obj5 = null;
                            }
                            gr1 gr1Var = (gr1) obj5;
                            if (obj3 instanceof Result.Failure) {
                                obj3 = null;
                            }
                            return new mol0(storefrontServicesArgs2, y7p0Var, gr1Var, (lsi0) obj3, loadingState2, 176);
                        }
                        StorefrontServicesArgs storefrontServicesArgs4 = (StorefrontServicesArgs) aol0Var.L$3;
                        loadingState = (LoadingState) aol0Var.L$2;
                        obj2 = aol0Var.L$1;
                        Object obj8 = aol0Var.L$0;
                        kotlin.a.a(obj6);
                        storefrontServicesArgs = storefrontServicesArgs4;
                        obj = obj8;
                        String str22 = (String) obj6;
                        Integer num2 = new Integer(0);
                        aol0Var.L$0 = obj;
                        aol0Var.L$1 = obj2;
                        aol0Var.L$2 = loadingState;
                        aol0Var.L$3 = storefrontServicesArgs;
                        aol0Var.L$4 = str22;
                        aol0Var.label = 4;
                        a = a(num2, aol0Var);
                        if (a != obj7) {
                            str = str22;
                            obj6 = a;
                            obj3 = obj;
                            loadingState2 = loadingState;
                            obj4 = obj2;
                            storefrontServicesArgs2 = storefrontServicesArgs;
                            obj5 = obj4;
                            y7p0 y7p0Var2 = new y7p0(str, (Integer) obj6);
                            if (obj5 instanceof Result.Failure) {
                            }
                            gr1 gr1Var2 = (gr1) obj5;
                            if (obj3 instanceof Result.Failure) {
                            }
                            return new mol0(storefrontServicesArgs2, y7p0Var2, gr1Var2, (lsi0) obj3, loadingState2, 176);
                        }
                        return obj7;
                    }
                    kotlin.a.a(obj6);
                    f = ((Result) obj6).d();
                }
                obj = f;
                aol0Var.L$0 = obj;
                aol0Var.label = 2;
                b = b(0, aol0Var);
            }
        }
        aol0Var = new aol0(this, continuationImpl);
        Object obj62 = aol0Var.result;
        Object obj72 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aol0Var.label;
        if (i != 0) {
        }
        obj = f;
        aol0Var.L$0 = obj;
        aol0Var.label = 2;
        b = b(0, aol0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006d A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:11:0x0028, B:12:0x0065, B:14:0x006d, B:16:0x0076, B:18:0x007c, B:20:0x0082, B:33:0x0039, B:36:0x004f), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable i(ContinuationImpl continuationImpl) {
        bol0 bol0Var;
        int i;
        GroupsGroupFullDto groupsGroupFullDto;
        GroupsMarketInfoDto b1;
        MarketCurrencyDto f;
        try {
            if (continuationImpl instanceof bol0) {
                bol0Var = (bol0) continuationImpl;
                int i2 = bol0Var.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bol0Var.label = i2 - Integer.MIN_VALUE;
                    Object obj = bol0Var.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = bol0Var.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        List singletonList = Collections.singletonList(fkq0.e(this.c));
                        List singletonList2 = Collections.singletonList(GroupsFieldsDto.MARKET);
                        if ((4 & 2) != 0) {
                            singletonList2 = null;
                        }
                        iz2 A = yfb.A(xqu.a.a(null, singletonList, singletonList2));
                        bol0Var.L$0 = null;
                        bol0Var.I$0 = 0;
                        bol0Var.label = 1;
                        obj = evj.p(A, bol0Var);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                    }
                    List<GroupsGroupFullDto> d = ((GroupsGetByIdObjectResponseDto) obj).d();
                    groupsGroupFullDto = d != null ? (GroupsGroupFullDto) j5g.a0(d) : null;
                    if (groupsGroupFullDto != null || (b1 = groupsGroupFullDto.b1()) == null || (f = b1.f()) == null) {
                        return "₽";
                    }
                    String title = f.getTitle();
                    return title == null ? "₽" : title;
                }
            }
            if (i != 0) {
            }
            List<GroupsGroupFullDto> d2 = ((GroupsGetByIdObjectResponseDto) obj).d();
            if (d2 != null) {
            }
            return groupsGroupFullDto != null ? "₽" : "₽";
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        bol0Var = new bol0(this, continuationImpl);
        Object obj2 = bol0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bol0Var.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, ServicesSort servicesSort, snl0 snl0Var, String str2, int i, ContinuationImpl continuationImpl) {
        col0 col0Var;
        int i2;
        dol0 dol0Var;
        try {
            if (continuationImpl instanceof col0) {
                col0Var = (col0) continuationImpl;
                int i3 = col0Var.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    col0Var.label = i3 - Integer.MIN_VALUE;
                    Object obj = col0Var.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = col0Var.label;
                    if (i2 != 0) {
                        kotlin.a.a(obj);
                        yd10 yd10Var = new yd10();
                        UserId userId = this.c;
                        Integer num = this.d;
                        String str3 = this.f;
                        String str4 = str3 == null ? str2 : str3;
                        int k = servicesSort.k();
                        iz2 A = yfb.A(yd10Var.G(userId, num, str, str4, k(snl0Var.a), k(snl0Var.b), k != 0 ? k != 1 ? k != 2 ? MarketSearchServicesSortDto.RELEVANCE : MarketSearchServicesSortDto.PRICE : MarketSearchServicesSortDto.DATE : MarketSearchServicesSortDto.DEFAULT, servicesSort.j() == 0 ? MarketSearchServicesRevDto.NORMAL : MarketSearchServicesRevDto.REVERSE, new Integer(i), new Integer(20)));
                        col0Var.L$0 = null;
                        col0Var.L$1 = null;
                        col0Var.L$2 = null;
                        col0Var.L$3 = null;
                        col0Var.L$4 = this;
                        col0Var.I$0 = i;
                        col0Var.I$1 = 0;
                        col0Var.label = 1;
                        obj = evj.p(A, col0Var);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        dol0Var = this;
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        dol0Var = (dol0) col0Var.L$4;
                        kotlin.a.a(obj);
                    }
                    return dol0Var.g.b((MarketSearchResponseDto) obj);
                }
            }
            if (i2 != 0) {
            }
            return dol0Var.g.b((MarketSearchResponseDto) obj);
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        col0Var = new col0(this, continuationImpl);
        Object obj2 = col0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = col0Var.label;
    }
}
