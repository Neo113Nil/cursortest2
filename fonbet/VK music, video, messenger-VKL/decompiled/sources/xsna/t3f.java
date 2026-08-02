package xsna;

import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.clips.viewer.impl.feed.view.list.item.controls.side.shares.fast.config.ClipsFastShareConfig$Strategy;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.t3f;
import xsna.u3f;

/* compiled from: ClipsShareRepository.kt */
/* loaded from: classes17.dex */
public final class t3f {
    public final h3f a = new h3f();
    public final o3f b = new o3f();

    /* compiled from: ClipsShareRepository.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsFastShareConfig$Strategy.values().length];
            try {
                iArr[ClipsFastShareConfig$Strategy.FRIENDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsFastShareConfig$Strategy.CHATS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final io.reactivex.rxjava3.internal.operators.single.e0 a(final u3f.b bVar) {
        return new io.reactivex.rxjava3.internal.operators.single.e0(new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.c(new io.reactivex.rxjava3.functions.n() { // from class: xsna.s3f
            @Override // io.reactivex.rxjava3.functions.n
            public final Object get() {
                o3f o3fVar = this.b;
                u3f.b bVar2 = u3f.b.this;
                ClipsFastShareConfig$Strategy clipsFastShareConfig$Strategy = bVar2.b;
                boolean z = bVar2.c;
                int i = bVar2.a;
                int i2 = t3f.a.$EnumSwitchMapping$0[clipsFastShareConfig$Strategy.ordinal()];
                if (i2 == 1) {
                    List<UsersFieldsDto> list = o3f.f;
                    return o3fVar.d(i, 0, z, EmptyList.b);
                }
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                List<UsersFieldsDto> list2 = o3f.f;
                return o3fVar.c(i, 0, z, EmptyList.b);
            }
        }), new ai3(new v74(6, this, bVar), 13)), new com.vk.movika.sdk.base.ui.p0(new com.vk.voip.ui.menu.feature.a(bVar, this), 11));
    }
}
