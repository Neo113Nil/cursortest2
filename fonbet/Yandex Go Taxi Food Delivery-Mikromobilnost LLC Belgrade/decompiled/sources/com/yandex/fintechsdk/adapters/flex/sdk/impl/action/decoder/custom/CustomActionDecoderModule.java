package com.yandex.fintechsdk.adapters.flex.sdk.impl.action.decoder.custom;

import defpackage.kg5;
import defpackage.lu;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u0012\u0012\u0006\b\u0001\u0012\u00020\u000b\u0018\u00010\nj\u0004\u0018\u0001`\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/action/decoder/custom/CustomActionDecoderModule;", "Llu;", "", "Lkg5;", "Lig5;", "actionsInfo", "<init>", "(Ljava/util/List;)V", "", "type", "Lkotlinx/serialization/KSerializer;", "Lkr;", "Lflex/actions/factory/decoder/AnyActionDecoder;", "decoder", "(Ljava/lang/String;)Lkotlinx/serialization/KSerializer;", "Ljava/util/List;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CustomActionDecoderModule implements lu {
    private final List<kg5> actionsInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public CustomActionDecoderModule(List<? extends kg5> list) {
        this.actionsInfo = list;
    }

    @Override // defpackage.lu
    public KSerializer decoder(String type) {
        Object obj;
        Iterator<T> it = this.actionsInfo.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (type.equals(((kg5) obj).a)) {
                break;
            }
        }
        kg5 kg5Var = (kg5) obj;
        KSerializer kSerializer = kg5Var != null ? kg5Var.c : null;
        if (kSerializer != null) {
            return new CustomActionDecoder(kSerializer, type);
        }
        return null;
    }
}
