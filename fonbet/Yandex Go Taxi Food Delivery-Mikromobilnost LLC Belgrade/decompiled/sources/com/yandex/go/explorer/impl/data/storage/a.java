package com.yandex.go.explorer.impl.data.storage;

import android.content.Context;
import com.yandex.go.explorer.impl.data.models.LocationEntryDto;
import com.yandex.go.explorer.impl.data.storage.a;
import defpackage.g050;
import defpackage.g3r;
import defpackage.gtq0;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.sls;
import defpackage.wnt;
import defpackage.xnt;
import defpackage.zy11;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final Context a;
    public final wnt b;
    public final kotlinx.coroutines.sync.a c = gtq0.a();
    public final i3y d;
    public final i3y e;
    public BufferedWriter f;

    public a(Context context, wnt wntVar) {
        this.a = context;
        this.b = wntVar;
        final int i = 0;
        this.d = kotlin.a.a(new sls(this) { // from class: buo
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                a aVar = this.b;
                switch (i2) {
                    case 0:
                        File file = new File(aVar.a.getFilesDir(), "explorer_locations");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        return file;
                    default:
                        return new File((File) aVar.d.getValue(), "explorer_locations.jsonl");
                }
            }
        });
        final int i2 = 1;
        this.e = kotlin.a.a(new sls(this) { // from class: buo
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                a aVar = this.b;
                switch (i22) {
                    case 0:
                        File file = new File(aVar.a.getFilesDir(), "explorer_locations");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        return file;
                    default:
                        return new File((File) aVar.d.getValue(), "explorer_locations.jsonl");
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:11:0x0045, B:13:0x0049, B:14:0x004f, B:16:0x005d), top: B:10:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d A[Catch: all -> 0x004d, TRY_LEAVE, TryCatch #0 {all -> 0x004d, blocks: (B:11:0x0045, B:13:0x0049, B:14:0x004f, B:16:0x005d), top: B:10:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ExplorerLocationFileStorage$clearFile$1 explorerLocationFileStorage$clearFile$1;
        int i;
        g050 g050Var;
        BufferedWriter bufferedWriter;
        i3y i3yVar = this.e;
        try {
            if (continuationImpl instanceof ExplorerLocationFileStorage$clearFile$1) {
                explorerLocationFileStorage$clearFile$1 = (ExplorerLocationFileStorage$clearFile$1) continuationImpl;
                int i2 = explorerLocationFileStorage$clearFile$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    explorerLocationFileStorage$clearFile$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = explorerLocationFileStorage$clearFile$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = explorerLocationFileStorage$clearFile$1.label;
                    if (i != 0) {
                        b.b(obj);
                        kotlinx.coroutines.sync.a aVar = this.c;
                        explorerLocationFileStorage$clearFile$1.L$0 = aVar;
                        explorerLocationFileStorage$clearFile$1.label = 1;
                        if (aVar.a(explorerLocationFileStorage$clearFile$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) explorerLocationFileStorage$clearFile$1.L$0;
                        b.b(obj);
                    }
                    bufferedWriter = this.f;
                    if (bufferedWriter != null) {
                        bufferedWriter.close();
                    }
                    this.f = null;
                    if (((File) i3yVar.getValue()).exists()) {
                        g3r.g((File) i3yVar.getValue(), "");
                    }
                    g050Var.d(null);
                    return zy11.a;
                }
            }
            bufferedWriter = this.f;
            if (bufferedWriter != null) {
            }
            this.f = null;
            if (((File) i3yVar.getValue()).exists()) {
            }
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
        explorerLocationFileStorage$clearFile$1 = new ExplorerLocationFileStorage$clearFile$1(this, continuationImpl);
        Object obj2 = explorerLocationFileStorage$clearFile$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = explorerLocationFileStorage$clearFile$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[Catch: all -> 0x004d, TryCatch #3 {all -> 0x004d, blocks: (B:11:0x0045, B:13:0x0049, B:14:0x004f, B:16:0x005b, B:20:0x005e, B:21:0x0071, B:23:0x0077, B:28:0x0093, B:38:0x0099, B:35:0x0097, B:25:0x007d), top: B:10:0x0045, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b A[Catch: all -> 0x004d, TryCatch #3 {all -> 0x004d, blocks: (B:11:0x0045, B:13:0x0049, B:14:0x004f, B:16:0x005b, B:20:0x005e, B:21:0x0071, B:23:0x0077, B:28:0x0093, B:38:0x0099, B:35:0x0097, B:25:0x007d), top: B:10:0x0045, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e A[Catch: all -> 0x004d, TryCatch #3 {all -> 0x004d, blocks: (B:11:0x0045, B:13:0x0049, B:14:0x004f, B:16:0x005b, B:20:0x005e, B:21:0x0071, B:23:0x0077, B:28:0x0093, B:38:0x0099, B:35:0x0097, B:25:0x007d), top: B:10:0x0045, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(ContinuationImpl continuationImpl) {
        ExplorerLocationFileStorage$readLocations$1 explorerLocationFileStorage$readLocations$1;
        int i;
        g050 g050Var;
        BufferedWriter bufferedWriter;
        Serializable serializable;
        LocationEntryDto locationEntryDto;
        i3y i3yVar = this.e;
        try {
            if (continuationImpl instanceof ExplorerLocationFileStorage$readLocations$1) {
                explorerLocationFileStorage$readLocations$1 = (ExplorerLocationFileStorage$readLocations$1) continuationImpl;
                int i2 = explorerLocationFileStorage$readLocations$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    explorerLocationFileStorage$readLocations$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = explorerLocationFileStorage$readLocations$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = explorerLocationFileStorage$readLocations$1.label;
                    if (i != 0) {
                        b.b(obj);
                        kotlinx.coroutines.sync.a aVar = this.c;
                        explorerLocationFileStorage$readLocations$1.L$0 = aVar;
                        explorerLocationFileStorage$readLocations$1.label = 1;
                        if (aVar.a(explorerLocationFileStorage$readLocations$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) explorerLocationFileStorage$readLocations$1.L$0;
                        b.b(obj);
                    }
                    bufferedWriter = this.f;
                    if (bufferedWriter != null) {
                        bufferedWriter.flush();
                    }
                    if (((File) i3yVar.getValue()).exists()) {
                        serializable = EmptyList.a;
                    } else {
                        ArrayList d = g3r.d((File) i3yVar.getValue());
                        ArrayList arrayList = new ArrayList();
                        Iterator it = d.iterator();
                        while (it.hasNext()) {
                            try {
                                locationEntryDto = (LocationEntryDto) ((xnt) this.b).c((String) it.next(), LocationEntryDto.Companion.serializer());
                            } catch (CancellationException e) {
                                throw e;
                            } catch (Throwable unused) {
                                locationEntryDto = null;
                            }
                            if (locationEntryDto != null) {
                                arrayList.add(locationEntryDto);
                            }
                        }
                        serializable = arrayList;
                    }
                    g050Var.d(null);
                    return serializable;
                }
            }
            bufferedWriter = this.f;
            if (bufferedWriter != null) {
            }
            if (((File) i3yVar.getValue()).exists()) {
            }
            g050Var.d(null);
            return serializable;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
        explorerLocationFileStorage$readLocations$1 = new ExplorerLocationFileStorage$readLocations$1(this, continuationImpl);
        Object obj2 = explorerLocationFileStorage$readLocations$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = explorerLocationFileStorage$readLocations$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:11:0x004a, B:13:0x004e, B:14:0x0065), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v4, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(LocationEntryDto locationEntryDto, ContinuationImpl continuationImpl) {
        ExplorerLocationFileStorage$writeLocationEntry$1 explorerLocationFileStorage$writeLocationEntry$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        BufferedWriter bufferedWriter;
        try {
            if (continuationImpl instanceof ExplorerLocationFileStorage$writeLocationEntry$1) {
                explorerLocationFileStorage$writeLocationEntry$1 = (ExplorerLocationFileStorage$writeLocationEntry$1) continuationImpl;
                int i2 = explorerLocationFileStorage$writeLocationEntry$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    explorerLocationFileStorage$writeLocationEntry$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = explorerLocationFileStorage$writeLocationEntry$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = explorerLocationFileStorage$writeLocationEntry$1.label;
                    if (i != 0) {
                        b.b(obj);
                        explorerLocationFileStorage$writeLocationEntry$1.L$0 = locationEntryDto;
                        aVar = this.c;
                        explorerLocationFileStorage$writeLocationEntry$1.L$1 = aVar;
                        explorerLocationFileStorage$writeLocationEntry$1.label = 1;
                        if (aVar.a(explorerLocationFileStorage$writeLocationEntry$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r6 = (g050) explorerLocationFileStorage$writeLocationEntry$1.L$1;
                        LocationEntryDto locationEntryDto2 = (LocationEntryDto) explorerLocationFileStorage$writeLocationEntry$1.L$0;
                        b.b(obj);
                        aVar = r6;
                        locationEntryDto = locationEntryDto2;
                    }
                    bufferedWriter = this.f;
                    if (bufferedWriter == null) {
                        bufferedWriter = new BufferedWriter(new FileWriter((File) this.e.getValue(), true));
                        this.f = bufferedWriter;
                    }
                    bufferedWriter.append((CharSequence) ((xnt) this.b).e(locationEntryDto, LocationEntryDto.Companion.serializer())).append('\n');
                    bufferedWriter.flush();
                    aVar.d(null);
                    return zy11.a;
                }
            }
            bufferedWriter = this.f;
            if (bufferedWriter == null) {
            }
            bufferedWriter.append((CharSequence) ((xnt) this.b).e(locationEntryDto, LocationEntryDto.Companion.serializer())).append('\n');
            bufferedWriter.flush();
            aVar.d(null);
            return zy11.a;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        explorerLocationFileStorage$writeLocationEntry$1 = new ExplorerLocationFileStorage$writeLocationEntry$1(this, continuationImpl);
        Object obj2 = explorerLocationFileStorage$writeLocationEntry$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = explorerLocationFileStorage$writeLocationEntry$1.label;
        if (i != 0) {
        }
    }
}
