package xsna;

import android.os.Parcelable;
import android.util.SparseArray;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.lists.ListDataSet;
import com.vkontakte.android.attachments.ShitAttachment;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.RandomAccess;
import java.util.concurrent.Callable;
import one.video.calls.sdk.upload.d;
import ru.ok.android.commons.http.Http;
import ru.ok.android.util.Files;
import ru.ok.android.util.IOUtil;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class c8s implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c8s(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x037e  */
    /* JADX WARN: Type inference failed for: r3v1, types: [one.video.calls.sdk.upload.b] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        char c;
        char c2;
        InputStream inputStream;
        HttpURLConnection httpURLConnection;
        OutputStream outputStream;
        FileInputStream fileInputStream;
        one.video.calls.sdk.upload.b bVar;
        HttpURLConnection httpURLConnection2;
        OutputStream outputStream2;
        OutputStream outputStream3;
        InputStream inputStream2;
        InputStream inputStream3;
        one.video.calls.sdk.upload.b bVar2;
        Charset charset;
        BufferedWriter bufferedWriter;
        InputStream inputStream4;
        String b;
        one.video.calls.sdk.upload.d dVar;
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                File file = (File) obj2;
                ?? r3 = (one.video.calls.sdk.upload.b) obj;
                String str = "Uploading was successful. Code: ";
                String a = defpackage.k0.a(System.currentTimeMillis(), "Boundary-");
                try {
                    httpURLConnection2 = (HttpURLConnection) new URL((String) obj3).openConnection();
                    httpURLConnection2.setDoOutput(true);
                    c2 = 2;
                    try {
                        httpURLConnection2.setRequestMethod("POST");
                        c = 1;
                    } catch (Exception e) {
                        e = e;
                        c = 1;
                    } catch (Throwable th) {
                        th = th;
                        c = 1;
                    }
                } catch (Exception e2) {
                    e = e2;
                    c = 1;
                    str = "FormDataFileUploader";
                    c2 = 2;
                } catch (Throwable th2) {
                    th = th2;
                    c = 1;
                    c2 = 2;
                }
                try {
                    httpURLConnection2.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + a);
                    httpURLConnection2.setRequestProperty(Http.Header.CONTENT_ENCODING, Http.ContentEncoding.GZIP);
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream(file);
                        try {
                            outputStream = httpURLConnection2.getOutputStream();
                            try {
                                try {
                                    charset = emb.b;
                                    bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, charset), 8192);
                                    bufferedWriter.write("--" + a + "\r\n");
                                    bufferedWriter.write("Content-Disposition: form-data; name=\"file\"; filename=\"" + file.getName() + "\"\r\n");
                                    bufferedWriter.write("Content-Type: application/octet-stream\r\n");
                                    bufferedWriter.write("\r\n");
                                    bufferedWriter.flush();
                                } catch (Exception e3) {
                                    e = e3;
                                    str = "FormDataFileUploader";
                                    outputStream3 = outputStream;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                outputStream2 = outputStream;
                                inputStream2 = null;
                                outputStream = outputStream2;
                                httpURLConnection = httpURLConnection2;
                                inputStream = inputStream2;
                                fileInputStream = fileInputStream2;
                                IOUtil iOUtil = IOUtil.INSTANCE;
                                Closeable[] closeableArr = new Closeable[3];
                                closeableArr[0] = fileInputStream;
                                closeableArr[c] = outputStream;
                                closeableArr[c2] = inputStream;
                                iOUtil.close(closeableArr);
                                if (httpURLConnection != null) {
                                }
                                throw th;
                            }
                            try {
                                Files.streamCopy(fileInputStream2, outputStream);
                                bufferedWriter.write("\r\n");
                                bufferedWriter.write("--" + a + "--\r\n");
                                bufferedWriter.flush();
                                int responseCode = httpURLConnection2.getResponseCode();
                                boolean z = 200 <= responseCode && responseCode < 300;
                                if (z) {
                                    try {
                                        inputStream4 = httpURLConnection2.getInputStream();
                                    } catch (Exception e4) {
                                        e = e4;
                                        outputStream3 = outputStream;
                                        str = "FormDataFileUploader";
                                        inputStream3 = null;
                                        bVar2 = r3;
                                        outputStream = outputStream3;
                                        httpURLConnection = httpURLConnection2;
                                        inputStream = inputStream3;
                                        fileInputStream = fileInputStream2;
                                        bVar = bVar2;
                                        try {
                                            bVar.a.log(str, "Uploading failed with " + e);
                                            d.a aVar = new d.a(e.getMessage());
                                            IOUtil iOUtil2 = IOUtil.INSTANCE;
                                            Closeable[] closeableArr2 = new Closeable[3];
                                            closeableArr2[0] = fileInputStream;
                                            closeableArr2[c] = outputStream;
                                            closeableArr2[c2] = inputStream;
                                            iOUtil2.close(closeableArr2);
                                            if (httpURLConnection != null) {
                                            }
                                            return aVar;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            IOUtil iOUtil3 = IOUtil.INSTANCE;
                                            Closeable[] closeableArr3 = new Closeable[3];
                                            closeableArr3[0] = fileInputStream;
                                            closeableArr3[c] = outputStream;
                                            closeableArr3[c2] = inputStream;
                                            iOUtil3.close(closeableArr3);
                                            if (httpURLConnection != null) {
                                                httpURLConnection.disconnect();
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    inputStream4 = httpURLConnection2.getErrorStream();
                                }
                                if (inputStream4 != null) {
                                    try {
                                        try {
                                            b = a0a.b(new BufferedReader(new InputStreamReader(inputStream4, charset), 8192));
                                        } catch (Exception e5) {
                                            e = e5;
                                            inputStream3 = inputStream4;
                                            outputStream3 = outputStream;
                                            str = "FormDataFileUploader";
                                            bVar2 = r3;
                                            outputStream = outputStream3;
                                            httpURLConnection = httpURLConnection2;
                                            inputStream = inputStream3;
                                            fileInputStream = fileInputStream2;
                                            bVar = bVar2;
                                            bVar.a.log(str, "Uploading failed with " + e);
                                            d.a aVar2 = new d.a(e.getMessage());
                                            IOUtil iOUtil22 = IOUtil.INSTANCE;
                                            Closeable[] closeableArr22 = new Closeable[3];
                                            closeableArr22[0] = fileInputStream;
                                            closeableArr22[c] = outputStream;
                                            closeableArr22[c2] = inputStream;
                                            iOUtil22.close(closeableArr22);
                                            if (httpURLConnection != null) {
                                            }
                                            return aVar2;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        inputStream2 = inputStream4;
                                        outputStream2 = outputStream;
                                        outputStream = outputStream2;
                                        httpURLConnection = httpURLConnection2;
                                        inputStream = inputStream2;
                                        fileInputStream = fileInputStream2;
                                        IOUtil iOUtil32 = IOUtil.INSTANCE;
                                        Closeable[] closeableArr32 = new Closeable[3];
                                        closeableArr32[0] = fileInputStream;
                                        closeableArr32[c] = outputStream;
                                        closeableArr32[c2] = inputStream;
                                        iOUtil32.close(closeableArr32);
                                        if (httpURLConnection != null) {
                                        }
                                        throw th;
                                    }
                                } else {
                                    b = null;
                                }
                                try {
                                    if (z) {
                                        try {
                                            str = "FormDataFileUploader";
                                            r3.a.log(str, "Uploading was successful. Code: " + responseCode + ", message " + b);
                                            dVar = d.b.a;
                                        } catch (Exception e6) {
                                            e = e6;
                                            str = "FormDataFileUploader";
                                            inputStream3 = inputStream4;
                                            outputStream3 = outputStream;
                                            bVar2 = r3;
                                            outputStream = outputStream3;
                                            httpURLConnection = httpURLConnection2;
                                            inputStream = inputStream3;
                                            fileInputStream = fileInputStream2;
                                            bVar = bVar2;
                                            bVar.a.log(str, "Uploading failed with " + e);
                                            d.a aVar22 = new d.a(e.getMessage());
                                            IOUtil iOUtil222 = IOUtil.INSTANCE;
                                            Closeable[] closeableArr222 = new Closeable[3];
                                            closeableArr222[0] = fileInputStream;
                                            closeableArr222[c] = outputStream;
                                            closeableArr222[c2] = inputStream;
                                            iOUtil222.close(closeableArr222);
                                            if (httpURLConnection != null) {
                                                httpURLConnection.disconnect();
                                            }
                                            return aVar22;
                                        }
                                    } else {
                                        str = "FormDataFileUploader";
                                        r3.a.log(str, "Uploading failed. Code: " + responseCode + ", message " + b);
                                        dVar = new d.a("Code: " + responseCode + ", message " + b);
                                    }
                                    r3 = new Closeable[]{fileInputStream2, outputStream, inputStream4};
                                    IOUtil.INSTANCE.close((Closeable[]) r3);
                                    httpURLConnection2.disconnect();
                                    return dVar;
                                } catch (Exception e7) {
                                    e = e7;
                                }
                            } catch (Exception e8) {
                                e = e8;
                                str = "FormDataFileUploader";
                                fileInputStream = fileInputStream2;
                                httpURLConnection = httpURLConnection2;
                                inputStream = null;
                                bVar = r3;
                                bVar.a.log(str, "Uploading failed with " + e);
                                d.a aVar222 = new d.a(e.getMessage());
                                IOUtil iOUtil2222 = IOUtil.INSTANCE;
                                Closeable[] closeableArr2222 = new Closeable[3];
                                closeableArr2222[0] = fileInputStream;
                                closeableArr2222[c] = outputStream;
                                closeableArr2222[c2] = inputStream;
                                iOUtil2222.close(closeableArr2222);
                                if (httpURLConnection != null) {
                                }
                                return aVar222;
                            } catch (Throwable th6) {
                                th = th6;
                                fileInputStream = fileInputStream2;
                                httpURLConnection = httpURLConnection2;
                                inputStream = null;
                                IOUtil iOUtil322 = IOUtil.INSTANCE;
                                Closeable[] closeableArr322 = new Closeable[3];
                                closeableArr322[0] = fileInputStream;
                                closeableArr322[c] = outputStream;
                                closeableArr322[c2] = inputStream;
                                iOUtil322.close(closeableArr322);
                                if (httpURLConnection != null) {
                                }
                                throw th;
                            }
                        } catch (Exception e9) {
                            e = e9;
                            str = "FormDataFileUploader";
                            outputStream3 = null;
                        } catch (Throwable th7) {
                            th = th7;
                            outputStream2 = null;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        str = "FormDataFileUploader";
                        httpURLConnection = httpURLConnection2;
                        inputStream = null;
                        outputStream = null;
                        fileInputStream = null;
                        bVar = r3;
                        bVar.a.log(str, "Uploading failed with " + e);
                        d.a aVar2222 = new d.a(e.getMessage());
                        IOUtil iOUtil22222 = IOUtil.INSTANCE;
                        Closeable[] closeableArr22222 = new Closeable[3];
                        closeableArr22222[0] = fileInputStream;
                        closeableArr22222[c] = outputStream;
                        closeableArr22222[c2] = inputStream;
                        iOUtil22222.close(closeableArr22222);
                        if (httpURLConnection != null) {
                        }
                        return aVar2222;
                    } catch (Throwable th8) {
                        th = th8;
                        httpURLConnection = httpURLConnection2;
                        inputStream = null;
                        outputStream = null;
                        fileInputStream = null;
                        IOUtil iOUtil3222 = IOUtil.INSTANCE;
                        Closeable[] closeableArr3222 = new Closeable[3];
                        closeableArr3222[0] = fileInputStream;
                        closeableArr3222[c] = outputStream;
                        closeableArr3222[c2] = inputStream;
                        iOUtil3222.close(closeableArr3222);
                        if (httpURLConnection != null) {
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                    str = "FormDataFileUploader";
                    inputStream = null;
                    httpURLConnection = null;
                    outputStream = null;
                    fileInputStream = null;
                    bVar = r3;
                    bVar.a.log(str, "Uploading failed with " + e);
                    d.a aVar22222 = new d.a(e.getMessage());
                    IOUtil iOUtil222222 = IOUtil.INSTANCE;
                    Closeable[] closeableArr222222 = new Closeable[3];
                    closeableArr222222[0] = fileInputStream;
                    closeableArr222222[c] = outputStream;
                    closeableArr222222[c2] = inputStream;
                    iOUtil222222.close(closeableArr222222);
                    if (httpURLConnection != null) {
                    }
                    return aVar22222;
                } catch (Throwable th9) {
                    th = th9;
                    inputStream = null;
                    httpURLConnection = null;
                    outputStream = null;
                    fileInputStream = null;
                    IOUtil iOUtil32222 = IOUtil.INSTANCE;
                    Closeable[] closeableArr32222 = new Closeable[3];
                    closeableArr32222[0] = fileInputStream;
                    closeableArr32222[c] = outputStream;
                    closeableArr32222[c2] = inputStream;
                    iOUtil32222.close(closeableArr32222);
                    if (httpURLConnection != null) {
                    }
                    throw th;
                }
                break;
            default:
                List list = (List) obj3;
                ListDataSet listDataSet = (ListDataSet) obj2;
                izs izsVar = (izs) obj;
                odg0.a.getClass();
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                List<Parcelable> list2 = list;
                if ((list2 instanceof List) && (list2 instanceof RandomAccess)) {
                    List list3 = list2;
                    int size = list3.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Parcelable parcelable = (NewsEntry) list3.get(i2);
                        if (parcelable instanceof Post) {
                            if (odg0.p((fsx0) parcelable, izsVar)) {
                                linkedHashSet.add(parcelable);
                            }
                            Post post = (Post) parcelable;
                            Post post2 = post.D;
                            if (post2 != null && odg0.p(post2, izsVar)) {
                                linkedHashSet.add(post.D);
                            }
                        } else if (parcelable instanceof PromoPost) {
                            PromoPost promoPost = (PromoPost) parcelable;
                            if (odg0.p(promoPost.n, izsVar)) {
                                linkedHashSet.add(promoPost.n);
                            }
                        } else if (parcelable instanceof ShitAttachment) {
                            if (odg0.o((ShitAttachment) parcelable, izsVar)) {
                                linkedHashSet.add(parcelable);
                            }
                        } else if (parcelable instanceof FaveEntry) {
                            if (odg0.p((fsx0) parcelable, izsVar)) {
                                Object obj4 = ((FaveEntry) parcelable).i.f;
                                NewsEntry newsEntry = obj4 instanceof NewsEntry ? (NewsEntry) obj4 : null;
                                if (newsEntry != null) {
                                    linkedHashSet.add(newsEntry);
                                }
                            }
                        } else if ((parcelable instanceof fsx0) && odg0.p((fsx0) parcelable, izsVar)) {
                            linkedHashSet.add(parcelable);
                        }
                    }
                } else {
                    for (Parcelable parcelable2 : list2) {
                        if (parcelable2 instanceof Post) {
                            if (odg0.p((fsx0) parcelable2, izsVar)) {
                                linkedHashSet.add(parcelable2);
                            }
                            Post post3 = (Post) parcelable2;
                            Post post4 = post3.D;
                            if (post4 != null && odg0.p(post4, izsVar)) {
                                linkedHashSet.add(post3.D);
                            }
                        } else if (parcelable2 instanceof PromoPost) {
                            PromoPost promoPost2 = (PromoPost) parcelable2;
                            if (odg0.p(promoPost2.n, izsVar)) {
                                linkedHashSet.add(promoPost2.n);
                            }
                        } else if (parcelable2 instanceof ShitAttachment) {
                            if (odg0.o((ShitAttachment) parcelable2, izsVar)) {
                                linkedHashSet.add(parcelable2);
                            }
                        } else if (parcelable2 instanceof FaveEntry) {
                            if (odg0.p((fsx0) parcelable2, izsVar)) {
                                Object obj5 = ((FaveEntry) parcelable2).i.f;
                                NewsEntry newsEntry2 = obj5 instanceof NewsEntry ? (NewsEntry) obj5 : null;
                                if (newsEntry2 != null) {
                                    linkedHashSet.add(newsEntry2);
                                }
                            }
                        } else if ((parcelable2 instanceof fsx0) && odg0.p((fsx0) parcelable2, izsVar)) {
                            linkedHashSet.add(parcelable2);
                        }
                    }
                }
                final SparseArray sparseArray = new SparseArray();
                if (!linkedHashSet.isEmpty()) {
                    final boolean z2 = list.size() == 1;
                    listDataSet.u(new wzs() { // from class: xsna.mdg0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj6, Object obj7) {
                            Integer num = (Integer) obj6;
                            u1c0 u1c0Var = (u1c0) obj7;
                            NewsEntry newsEntry3 = u1c0Var.a;
                            LinkedHashSet linkedHashSet2 = linkedHashSet;
                            if (!linkedHashSet2.contains(newsEntry3)) {
                                return s3q0.a;
                            }
                            int i3 = u1c0Var.c;
                            SparseArray sparseArray2 = sparseArray;
                            boolean z3 = true;
                            if (i3 == 5 || i3 == 97 || i3 == 124 || i3 == 192) {
                                sparseArray2.put(num.intValue(), u1c0Var);
                            } else if (i3 == 204 || i3 == 110 || i3 == 111) {
                                sparseArray2.put(num.intValue(), u1c0Var);
                                z3 = true ^ z2;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                linkedHashSet2.remove(u1c0Var.a);
                            }
                            return s3q0.a;
                        }
                    });
                }
                return sparseArray;
        }
    }
}
