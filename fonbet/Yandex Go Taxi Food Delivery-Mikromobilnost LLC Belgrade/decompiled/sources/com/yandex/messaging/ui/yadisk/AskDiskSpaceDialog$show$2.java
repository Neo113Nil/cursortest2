package com.yandex.messaging.ui.yadisk;

import android.widget.TextView;
import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.dk51;
import defpackage.ewh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uw80;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.yadisk.AskDiskSpaceDialog$show$2", f = "AskDiskSpaceDialog.kt", l = {PollMessageDraft.MAX_ANSWER_LENGTH, 141, 147}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AskDiskSpaceDialog$show$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<uw80> $files;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskDiskSpaceDialog$show$2(a aVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$files = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AskDiskSpaceDialog$show$2(this.this$0, this.$files, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AskDiskSpaceDialog$show$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0112, code lost:
    
        if (r15 == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        if (r15 == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x011d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0112 -> B:7:0x0115). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        TextView textView;
        dk51 dk51Var;
        Iterator it;
        long j;
        uw80 uw80Var;
        TextView textView2;
        TextView textView3;
        dk51 dk51Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            this.this$0.k.setText("");
            this.this$0.l.setText("");
            if (this.$files.size() == 1) {
                uw80Var = (uw80) kotlin.collections.a.P(this.$files);
                a aVar2 = this.this$0;
                textView2 = aVar2.k;
                this.L$0 = uw80Var;
                this.L$1 = textView2;
                this.label = 1;
                obj = a.a(aVar2, uw80Var, this);
            } else {
                a aVar3 = this.this$0;
                aVar3.k.setText(aVar3.a.getResources().getQuantityString(ewh0.ask_disk_space_files_count, this.$files.size(), new Integer(this.$files.size())));
                a aVar4 = this.this$0;
                aVar = aVar4;
                textView = aVar4.l;
                dk51Var = aVar4.r;
                it = this.$files.iterator();
                j = 0;
                if (it.hasNext()) {
                }
            }
        } else if (i == 1) {
            textView2 = (TextView) this.L$1;
            uw80Var = (uw80) this.L$0;
            b.b(obj);
        } else {
            if (i == 2) {
                dk51Var2 = (dk51) this.L$1;
                textView3 = (TextView) this.L$0;
                b.b(obj);
                textView3.setText(Extension.O_BRAKE + dk51Var2.a(((Number) obj).longValue()) + Extension.C_BRAKE);
                return zy11.a;
            }
            if (i != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.J$0;
            dk51Var = (dk51) this.L$3;
            textView = (TextView) this.L$2;
            it = (Iterator) this.L$1;
            aVar = (a) this.L$0;
            b.b(obj);
            j += ((Number) obj).longValue();
            if (it.hasNext()) {
                textView.setText(Extension.O_BRAKE + dk51Var.a(j) + Extension.C_BRAKE);
                return zy11.a;
            }
            uw80 uw80Var2 = (uw80) it.next();
            this.L$0 = aVar;
            this.L$1 = it;
            this.L$2 = textView;
            this.L$3 = dk51Var;
            this.J$0 = j;
            this.label = 3;
            obj = a.b(uw80Var2, aVar, this);
        }
        textView2.setText((CharSequence) obj);
        a aVar5 = this.this$0;
        TextView textView4 = aVar5.l;
        dk51 dk51Var3 = aVar5.r;
        this.L$0 = textView4;
        this.L$1 = dk51Var3;
        this.label = 2;
        obj = a.b(uw80Var, aVar5, this);
        if (obj != coroutineSingletons) {
            textView3 = textView4;
            dk51Var2 = dk51Var3;
            textView3.setText(Extension.O_BRAKE + dk51Var2.a(((Number) obj).longValue()) + Extension.C_BRAKE);
            return zy11.a;
        }
        return coroutineSingletons;
    }
}
