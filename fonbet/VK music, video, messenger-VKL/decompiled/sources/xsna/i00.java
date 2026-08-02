package xsna;

import com.squareup.wire.Message;
import com.vk.newsfeed.impl.data.database.entity.action.post.AddLikeActionEntity;

/* compiled from: ActionEntitySerializerFactoryImpl.kt */
/* loaded from: classes4.dex */
public final class i00 implements g00 {
    @Override // xsna.g00
    public final byte[] a(Message message) {
        return ((AddLikeActionEntity) message).encode();
    }

    @Override // xsna.g00
    public final Object b(byte[] bArr) {
        return AddLikeActionEntity.b.decode(bArr);
    }
}
