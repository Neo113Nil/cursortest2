package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.stat.scheme.CommonStat$TypeTrackCodeItem;
import com.vk.stat.scheme.CommonVasStat$TypeIvasItemViews;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stickers.ContextUser;
import io.reactivex.rxjava3.internal.functions.a;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import xsna.hzp0;

/* compiled from: AlbumsRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final class iv8 implements u4u0 {
    public final Object b;
    public final Object c;

    public iv8(float[] fArr, float[] fArr2) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        this.b = asFloatBuffer;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(fArr2.length * 4);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        asFloatBuffer2.put(fArr2);
        asFloatBuffer2.position(0);
        this.c = asFloatBuffer2;
    }

    public io.reactivex.rxjava3.core.q a(Object obj, gzs gzsVar) {
        Object a0Var;
        Object obj2;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
        Object obj3 = concurrentHashMap.get(obj);
        if (obj3 == null) {
            WeakReference weakReference = (WeakReference) ((ConcurrentHashMap) this.c).get(obj);
            if (weakReference == null || (obj2 = weakReference.get()) == null) {
                io.reactivex.rxjava3.core.q qVar = (io.reactivex.rxjava3.core.q) gzsVar.invoke();
                bn3 bn3Var = new bn3(new gv8(this, obj), 4);
                a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                a0Var = new io.reactivex.rxjava3.internal.operators.observable.a0(qVar.E(bn3Var, lVar, kVar, kVar).g0().O0(), new hv8(0, this, obj));
            } else {
                a0Var = io.reactivex.rxjava3.core.q.T(obj2);
            }
            Object putIfAbsent = concurrentHashMap.putIfAbsent(obj, a0Var);
            obj3 = putIfAbsent == null ? a0Var : putIfAbsent;
        }
        return (io.reactivex.rxjava3.core.q) obj3;
    }

    @Override // xsna.u4u0
    public void e(int i, Object obj, boolean z) {
        UserId userId;
        hfz hfzVar = (hfz) obj;
        xaf0 xaf0Var = (xaf0) this.c;
        if (((RecyclerView) this.b).isAttachedToWindow() && (hfzVar instanceof qdf0)) {
            ArrayList arrayList = new ArrayList();
            CommonVasStat$TypeIvasItemViews.BlockType blockType = CommonVasStat$TypeIvasItemViews.BlockType.BLOCK;
            qdf0 qdf0Var = (qdf0) hfzVar;
            StickerStockItem stickerStockItem = qdf0Var.b;
            arrayList.add(Integer.valueOf(stickerStockItem.b));
            String str = stickerStockItem.O;
            Long l = null;
            CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem = str != null ? new CommonStat$TypeTrackCodeItem(str) : null;
            Integer valueOf = Integer.valueOf(i);
            Integer valueOf2 = Integer.valueOf(((Number) xaf0Var.r.getValue()).intValue());
            Integer valueOf3 = Integer.valueOf(qdf0Var.c);
            ContextUser contextUser = xaf0Var.e;
            if (contextUser != null && (userId = contextUser.b) != null) {
                l = Long.valueOf(userId.b);
            }
            new hzp0.w(new SchemeStat$EventItem(SchemeStat$EventItem.Type.STICKERS, null, null, null, null, null, 62, null), new CommonVasStat$TypeIvasItemViews(CommonVasStat$TypeIvasItemViews.ItemType.STICKER_PACK, arrayList, valueOf3, blockType, null, valueOf, commonStat$TypeTrackCodeItem, valueOf2, l, null, null, null, 3600, null)).a();
        }
    }

    public iv8() {
        this.b = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
    }

    public iv8(RecyclerView recyclerView, xaf0 xaf0Var) {
        this.b = recyclerView;
        this.c = xaf0Var;
    }
}
