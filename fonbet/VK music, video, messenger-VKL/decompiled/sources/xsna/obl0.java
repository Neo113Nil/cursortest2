package xsna;

import android.content.Intent;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.bonus.StickersBonusResult;
import java.util.ArrayList;
import kotlin.NotImplementedError;
import xsna.nge0;

/* compiled from: StickersBridge.kt */
/* loaded from: classes5.dex */
public interface obl0 extends tb0 {
    public static final a A7 = a.a;

    void H7(StickerStockItem stickerStockItem, wzs<? super StickerStockItem, ? super nge0, s3q0> wzsVar);

    void Kk(ArrayList arrayList, wzs wzsVar);

    /* compiled from: StickersBridge.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final C3447a b = new C3447a();

        /* compiled from: StickersBridge.kt */
        /* renamed from: xsna.obl0$a$a, reason: collision with other inner class name */
        public static final class C3447a implements obl0 {
            @Override // xsna.obl0
            public final void H7(StickerStockItem stickerStockItem, wzs wzsVar) {
                throw new NotImplementedError("An operation is not implemented: not implemented");
            }

            @Override // xsna.obl0
            public final void Kk(ArrayList arrayList, wzs wzsVar) {
                throw new NotImplementedError("An operation is not implemented: not implemented");
            }

            @Override // xsna.obl0
            public final void a5(yzs<? super nge0.a, ? super StickersBonusResult, ? super izs<? super Boolean, s3q0>, s3q0> yzsVar) {
            }

            @Override // xsna.tb0
            public final void onActivityResult(int i, int i2, Intent intent) {
            }
        }
    }

    default void a5(yzs<? super nge0.a, ? super StickersBonusResult, ? super izs<? super Boolean, s3q0>, s3q0> yzsVar) {
    }
}
