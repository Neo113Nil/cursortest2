package xsna;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.editor.templates.impl.domain.ClipsTemplateEditorVideoItem;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: Camera2CameraFactory.java */
/* loaded from: classes11.dex */
public final class se9 implements oi9, fkt0 {
    public final Object a;
    public final Object b;
    public Object c;
    public Object d;
    public Serializable e;

    public se9(w6f w6fVar) {
        this.a = w6fVar;
        this.b = new io.reactivex.rxjava3.disposables.b();
    }

    @Override // xsna.oi9
    @NonNull
    public bj9 a() {
        return (bj9) this.c;
    }

    @Override // xsna.fkt0
    public void b() {
        r6f r6fVar = (r6f) this.d;
        r8f videoView = r6fVar != null ? r6fVar.getVideoView() : null;
        r6f r6fVar2 = (r6f) this.d;
        z8d b = r6fVar2 != null ? r6fVar2.b() : null;
        if (videoView == null || b == null) {
            return;
        }
        long duration = (long) (((r6f) this.d).getVideoView().getDuration() * ((w6f) this.a).b());
        u6f u6fVar = (u6f) this.c;
        if (u6fVar == null) {
            u6fVar = null;
        }
        videoView.c(duration);
        videoView.d(u6fVar.c.b.d() + duration);
        u6f u6fVar2 = (u6f) this.c;
        if (u6fVar2 == null) {
            u6fVar2 = null;
        }
        b.e = u6fVar2.d - duration;
        r6f r6fVar3 = (r6f) this.d;
        r8f videoView2 = r6fVar3 != null ? r6fVar3.getVideoView() : null;
        r6f r6fVar4 = (r6f) this.d;
        z8d b2 = r6fVar4 != null ? r6fVar4.b() : null;
        if (videoView2 != null && b2 != null) {
            u6f u6fVar3 = (u6f) this.c;
            if (u6fVar3 == null) {
                u6fVar3 = null;
            }
            ClipsTemplateEditorVideoItem a = ClipsTemplateEditorVideoItem.a(u6fVar3.c.c, videoView2.a(), videoView2.e(), null, 975);
            u6f u6fVar4 = (u6f) this.c;
            u6f u6fVar5 = u6fVar4 == null ? null : u6fVar4;
            if (u6fVar4 == null) {
                u6fVar4 = null;
            }
            n7f a2 = n7f.a(u6fVar4.c, a, null, null, 27);
            this.c = new u6f(u6fVar5.a, u6fVar5.b, a2, u6fVar5.d, u6fVar5.e);
            r6f r6fVar5 = (r6f) this.d;
            if (r6fVar5 != null) {
                r6fVar5.c(a2);
            }
        }
        b.f();
    }

    @Override // xsna.oi9
    @NonNull
    public we9 c(@NonNull String str) throws CameraUnavailableException {
        sk5 sk5Var = (sk5) this.a;
        if (((ArrayList) this.d).contains(str)) {
            return new we9((bj9) this.c, str, e(str), (androidx.camera.core.impl.e) this.b, sk5Var.a, sk5Var.b);
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    @Override // xsna.oi9
    @NonNull
    public LinkedHashSet d() {
        return new LinkedHashSet((ArrayList) this.d);
    }

    public ze9 e(@NonNull String str) throws CameraUnavailableException {
        HashMap hashMap = (HashMap) this.e;
        try {
            ze9 ze9Var = (ze9) hashMap.get(str);
            if (ze9Var != null) {
                return ze9Var;
            }
            ze9 ze9Var2 = new ze9(str, ((bj9) this.c).a(str));
            hashMap.put(str, ze9Var2);
            return ze9Var2;
        } catch (CameraAccessExceptionCompat e) {
            throw we7.f(e);
        }
    }

    @Override // xsna.fkt0
    public void l(float f) {
        r8f videoView;
        z8d b;
        z8d b2;
        r6f r6fVar = (r6f) this.d;
        if (r6fVar != null && (b2 = r6fVar.b()) != null) {
            b2.d(false);
        }
        r6f r6fVar2 = (r6f) this.d;
        if (r6fVar2 == null || (videoView = r6fVar2.getVideoView()) == null) {
            return;
        }
        u6f u6fVar = (u6f) this.c;
        if (u6fVar == null) {
            u6fVar = null;
        }
        long min = Math.min((long) (videoView.getDuration() * Math.max(f - u6fVar.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)), videoView.getDuration());
        r6f r6fVar3 = (r6f) this.d;
        if (r6fVar3 == null || (b = r6fVar3.b()) == null) {
            return;
        }
        b.h(min);
    }

    public se9(@NonNull Context context, @NonNull sk5 sk5Var, @Nullable nl9 nl9Var) throws InitializationException {
        cj9 cj9Var;
        this.e = new HashMap();
        this.a = sk5Var;
        this.b = new androidx.camera.core.impl.e();
        if (Build.VERSION.SDK_INT >= 29) {
            cj9Var = new dj9(context, null);
        } else {
            cj9Var = new cj9(context, null);
        }
        bj9 bj9Var = new bj9(cj9Var);
        this.c = bj9Var;
        try {
            ArrayList arrayList = new ArrayList();
            cj9 cj9Var2 = bj9Var.a;
            cj9Var2.getClass();
            try {
                List<String> asList = Arrays.asList(cj9Var2.a.getCameraIdList());
                if (nl9Var == null) {
                    Iterator it = asList.iterator();
                    while (it.hasNext()) {
                        arrayList.add((String) it.next());
                    }
                } else {
                    String a = ml9.a(bj9Var, nl9Var.c(), asList);
                    ArrayList arrayList2 = new ArrayList();
                    for (String str : asList) {
                        if (!str.equals(a)) {
                            arrayList2.add(e(str));
                        }
                    }
                    try {
                        Iterator it2 = nl9Var.b(arrayList2).iterator();
                        while (it2.hasNext()) {
                            arrayList.add(((ui9) ((ti9) it2.next())).a());
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                }
                this.d = arrayList;
            } catch (CameraAccessException e) {
                throw new CameraAccessExceptionCompat(e);
            }
        } catch (CameraAccessExceptionCompat e2) {
            throw new InitializationException(we7.f(e2));
        } catch (CameraUnavailableException e3) {
            throw new InitializationException(e3);
        }
    }
}
