package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockReorderState;
import com.vk.catalog.mvi.block.CatalogBlockReorderState$ReorderData$Album;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.section.domain.CatalogReorderData;
import com.vk.catalog.mvi.section.ui.entity.CatalogBlockData;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoPlaylistChangeOrder;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ReorderDelegate.kt */
/* loaded from: classes16.dex */
public final class rzf0 {
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0273, code lost:
    
        if (r2 == r3) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ce, code lost:
    
        if (r5 != null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e1, code lost:
    
        if (r2 != null) goto L106;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(eea eeaVar, String str, ContinuationImpl continuationImpl) {
        pzf0 pzf0Var;
        int i;
        Object obj;
        int i2;
        int i3;
        Object obj2;
        Object obj3;
        CatalogBlockReorderState$ReorderData$Album catalogBlockReorderState$ReorderData$Album;
        CatalogBlockReorderState$ReorderData$Album catalogBlockReorderState$ReorderData$Album2;
        Result result;
        Object f;
        utk0 utk0Var;
        utk0 utk0Var2;
        CatalogBlockState g;
        eea eeaVar2 = eeaVar;
        String str2 = str;
        if (continuationImpl instanceof pzf0) {
            pzf0Var = (pzf0) continuationImpl;
            int i4 = pzf0Var.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                pzf0Var.label = i4 - Integer.MIN_VALUE;
                pzf0 pzf0Var2 = pzf0Var;
                Object obj4 = pzf0Var2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pzf0Var2.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            int i5 = pzf0Var2.I$1;
                            int i6 = pzf0Var2.I$0;
                            String str3 = (String) pzf0Var2.L$1;
                            eea eeaVar3 = (eea) pzf0Var2.L$0;
                            kotlin.a.a(obj4);
                            f = ((Result) obj4).d();
                            i3 = i5;
                            i2 = i6;
                            str2 = str3;
                            eeaVar2 = eeaVar3;
                        } else if (i == 3) {
                        } else if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    kotlin.a.a(obj4);
                    return ((Result) obj4).d();
                }
                kotlin.a.a(obj4);
                sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var = eeaVar2.b;
                zea zeaVar = eeaVar2.f;
                List<CatalogBlockData> list = ((CatalogSectionState) sj50Var.getCurrentState()).k;
                if (list == null) {
                    list = ((CatalogSectionState) sj50Var.getCurrentState()).d;
                }
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (epx.f(b(((CatalogBlockData) obj).g().w()), str2)) {
                        break;
                    }
                }
                CatalogBlockData catalogBlockData = (CatalogBlockData) obj;
                if (catalogBlockData == null || (g = catalogBlockData.g()) == null) {
                    i2 = 0;
                } else {
                    CatalogBlockReorderState catalogBlockReorderState = g instanceof CatalogBlockReorderState ? (CatalogBlockReorderState) g : null;
                    i2 = (catalogBlockReorderState == null || catalogBlockReorderState.c3() == null) ? 0 : 1;
                }
                if (i2 != 0) {
                    CatalogReorderData catalogReorderData = (CatalogReorderData) j5g.a0(((CatalogSectionState) sj50Var.getCurrentState()).l);
                    if (catalogReorderData == null) {
                        List<CatalogReorderData> list2 = ((CatalogSectionState) sj50Var.getCurrentState()).l;
                        pzf0Var2.L$0 = null;
                        pzf0Var2.L$1 = null;
                        pzf0Var2.L$2 = null;
                        pzf0Var2.I$0 = i2;
                        pzf0Var2.label = 1;
                        Object g2 = zeaVar.g(str2, list2, pzf0Var2);
                        if (g2 != coroutineSingletons) {
                            return g2;
                        }
                    } else {
                        i3 = catalogReorderData.c < catalogReorderData.e ? 1 : 0;
                        List<CatalogBlockData> list3 = ((CatalogSectionState) sj50Var.getCurrentState()).k;
                        if (list3 == null) {
                            list3 = ((CatalogSectionState) sj50Var.getCurrentState()).d;
                        }
                        List<CatalogBlockData> list4 = list3;
                        Iterator<T> it2 = list4.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it2.next();
                            if (epx.f(b(((CatalogBlockData) obj2).g().w()), catalogReorderData.d)) {
                                break;
                            }
                        }
                        CatalogBlockData catalogBlockData2 = (CatalogBlockData) obj2;
                        CatalogBlockState catalogBlockState = (catalogBlockData2 == null || (utk0Var2 = catalogBlockData2.b) == null) ? null : (CatalogBlockState) utk0Var2.getValue();
                        Iterator<T> it3 = list4.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it3.next();
                            if (epx.f(b(((CatalogBlockData) obj3).g().w()), catalogReorderData.b)) {
                                break;
                            }
                        }
                        CatalogBlockData catalogBlockData3 = (CatalogBlockData) obj3;
                        CatalogBlockState catalogBlockState2 = (catalogBlockData3 == null || (utk0Var = catalogBlockData3.b) == null) ? null : (CatalogBlockState) utk0Var.getValue();
                        if (catalogBlockState2 != null) {
                            CatalogBlockReorderState catalogBlockReorderState2 = catalogBlockState2 instanceof CatalogBlockReorderState ? (CatalogBlockReorderState) catalogBlockState2 : null;
                            if (catalogBlockReorderState2 != null) {
                                catalogBlockReorderState$ReorderData$Album = catalogBlockReorderState2.c3();
                            }
                        }
                        catalogBlockReorderState$ReorderData$Album = null;
                        if (catalogBlockState != null) {
                            CatalogBlockReorderState catalogBlockReorderState3 = catalogBlockState instanceof CatalogBlockReorderState ? (CatalogBlockReorderState) catalogBlockState : null;
                            if (catalogBlockReorderState3 != null) {
                                catalogBlockReorderState$ReorderData$Album2 = catalogBlockReorderState3.c3();
                            }
                        }
                        catalogBlockReorderState$ReorderData$Album2 = null;
                        if (catalogBlockReorderState$ReorderData$Album == null || catalogBlockReorderState$ReorderData$Album2 == null) {
                            result = null;
                            if (result != null) {
                                return result.d();
                            }
                            zea zeaVar2 = eeaVar2.f;
                            List<CatalogReorderData> list5 = ((CatalogSectionState) eeaVar2.b.getCurrentState()).l;
                            pzf0Var2.L$0 = null;
                            pzf0Var2.L$1 = null;
                            pzf0Var2.L$2 = null;
                            pzf0Var2.L$3 = null;
                            pzf0Var2.L$4 = null;
                            pzf0Var2.L$5 = null;
                            pzf0Var2.L$6 = null;
                            pzf0Var2.L$7 = null;
                            pzf0Var2.L$8 = null;
                            pzf0Var2.L$9 = null;
                            pzf0Var2.L$10 = null;
                            pzf0Var2.I$0 = i2;
                            pzf0Var2.I$1 = i3;
                            pzf0Var2.label = 3;
                            Object g3 = zeaVar2.g(str2, list5, pzf0Var2);
                            if (g3 != coroutineSingletons) {
                                return g3;
                            }
                        } else {
                            int i7 = catalogBlockReorderState$ReorderData$Album2.c;
                            long j = catalogBlockReorderState$ReorderData$Album2.b;
                            SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, Long.valueOf(j), null, null, null, 58, null), new MobileOfficialAppsVideoStat$TypeVideoPlaylistChangeOrder(MobileOfficialAppsVideoStat$TypeVideoPlaylistChangeOrder.EventType.CHANGE_ORDER, catalogBlockReorderState$ReorderData$Album.c, j, MobileOfficialAppsVideoStat$TypeVideoPlaylistChangeOrder.VideoPlaylistType.SIMPLE_PLAYLIST, null, 16, null), 2);
                            UiTracker uiTracker = UiTracker.a;
                            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                            uzp0 uzp0Var = UiTracker.h;
                            uzp0Var.getClass();
                            new bjc(c, b, uzp0Var.a).q();
                            long j2 = catalogBlockReorderState$ReorderData$Album2.b;
                            int i8 = catalogBlockReorderState$ReorderData$Album.c;
                            Integer num = i3 == 0 ? new Integer(i7) : null;
                            Integer num2 = i3 != 0 ? new Integer(i7) : null;
                            pzf0Var2.L$0 = eeaVar2;
                            pzf0Var2.L$1 = str2;
                            pzf0Var2.L$2 = null;
                            pzf0Var2.L$3 = null;
                            pzf0Var2.L$4 = null;
                            pzf0Var2.L$5 = null;
                            pzf0Var2.L$6 = null;
                            pzf0Var2.L$7 = null;
                            pzf0Var2.L$8 = null;
                            pzf0Var2.L$9 = null;
                            pzf0Var2.L$10 = null;
                            pzf0Var2.I$0 = i2;
                            pzf0Var2.I$1 = i3;
                            pzf0Var2.I$2 = 0;
                            pzf0Var2.I$3 = 0;
                            pzf0Var2.label = 2;
                            f = zeaVar.f(j2, i8, num, num2, pzf0Var2);
                        }
                    }
                } else {
                    List<CatalogReorderData> list6 = ((CatalogSectionState) sj50Var.getCurrentState()).l;
                    pzf0Var2.L$0 = null;
                    pzf0Var2.L$1 = null;
                    pzf0Var2.L$2 = null;
                    pzf0Var2.I$0 = i2;
                    pzf0Var2.label = 4;
                    Object g4 = zeaVar.g(str2, list6, pzf0Var2);
                    if (g4 != coroutineSingletons) {
                        return g4;
                    }
                }
                return coroutineSingletons;
                result = new Result(f);
                if (result != null) {
                }
            }
        }
        pzf0Var = new pzf0(continuationImpl);
        pzf0 pzf0Var22 = pzf0Var;
        Object obj42 = pzf0Var22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pzf0Var22.label;
        if (i == 0) {
        }
        result = new Result(f);
        if (result != null) {
        }
    }

    public static final String b(BlockId blockId) {
        if (blockId instanceof BlockId.CompositeId) {
            BlockId.CompositeId compositeId = (BlockId.CompositeId) blockId;
            return compositeId.b.concat(compositeId.c);
        }
        if ((blockId instanceof BlockId.Simple) || (blockId instanceof BlockId.Unique)) {
            return blockId.getId();
        }
        throw new NoWhenBranchMatchedException();
    }
}
