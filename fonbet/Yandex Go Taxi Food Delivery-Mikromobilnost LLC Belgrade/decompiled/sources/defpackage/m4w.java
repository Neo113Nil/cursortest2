package defpackage;

import java.io.File;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.rt.ebs.cryptosdk.core.common.entities.models.ISdkDispatchers;
import ru.rt.ebs.cryptosdk.core.instructions.controllers.IInstructionsController;
import ru.rt.ebs.cryptosdk.core.instructions.controllers.a;
import ru.rt.ebs.cryptosdk.core.instructions.entities.exceptions.InstructionsEbsException;
import ru.rt.ebs.cryptosdk.core.storage.file.IFileManager;

/* loaded from: classes4.dex */
public final class m4w implements IInstructionsController {
    public final p4w a;
    public final zcf b;
    public final ISdkDispatchers c;

    public m4w(p4w p4wVar, zcf zcfVar, ISdkDispatchers iSdkDispatchers) {
        this.a = p4wVar;
        this.b = zcfVar;
        this.c = iSdkDispatchers;
    }

    @Override // ru.rt.ebs.cryptosdk.core.instructions.controllers.IInstructionsController
    public final Object fetchInstructionsData(Continuation continuation) {
        p4w p4wVar = this.a;
        IFileManager iFileManager = p4wVar.d;
        l4w l4wVar = p4wVar.e;
        File b = x2b1.b(iFileManager, l4wVar.b, l4wVar.a, 4);
        if (b.exists()) {
            return g3r.e(b);
        }
        throw new InstructionsEbsException("No instructions handler found");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // ru.rt.ebs.cryptosdk.core.instructions.controllers.IInstructionsController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateInstructionsMetadata(Continuation continuation) {
        a aVar;
        int i;
        try {
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i2 = aVar.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.c = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.a;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = aVar.c;
                    if (i != 0) {
                        b.b(obj);
                        jse io2 = this.c.io();
                        ru.rt.ebs.cryptosdk.core.instructions.controllers.b bVar = new ru.rt.ebs.cryptosdk.core.instructions.controllers.b(this, null);
                        aVar.c = 1;
                        if (tje.k0(io2, bVar, aVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                    }
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            return zy11.a;
        } catch (Exception e) {
            throw new InstructionsEbsException(e);
        }
        aVar = new a(this, continuation);
        Object obj2 = aVar.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.c;
    }
}
