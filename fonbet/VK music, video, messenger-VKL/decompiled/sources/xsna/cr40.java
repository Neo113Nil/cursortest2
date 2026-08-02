package xsna;

import com.vk.dto.common.id.UserId;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MusicOfflineSyncManagerImpl.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class cr40 extends FunctionReferenceImpl implements yzs<Integer, UserId, List<? extends String>, s3q0> {
    public cr40(com.vk.music.offline.impl.sync.d dVar) {
        super(3, dVar, com.vk.music.offline.impl.sync.d.class, "migrateVkMusicPhotosCache", "migrateVkMusicPhotosCache(ILcom/vk/dto/common/id/UserId;Ljava/util/List;)V", 0);
    }

    @Override // xsna.yzs
    public final s3q0 invoke(Integer num, UserId userId, List<? extends String> list) {
        com.vk.music.offline.impl.sync.d dVar = (com.vk.music.offline.impl.sync.d) this.receiver;
        dVar.l(userId, num.intValue(), list);
        return s3q0.a;
    }
}
