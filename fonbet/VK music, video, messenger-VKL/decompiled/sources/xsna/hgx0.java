package xsna;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import com.vk.core.fragments.FragmentImpl;
import com.vk.file_picker.FilePickerFragment;
import com.vk.file_picker.external.ExternalFilePickerFragment;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.browser.internal.utils.VkWebFileChooserImpl;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: WebFileChooser.kt */
/* loaded from: classes7.dex */
public final class hgx0 extends VkWebFileChooserImpl {
    public final FragmentImpl e;
    public final boolean f;

    /* compiled from: WebFileChooser.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkWebFileChooserImpl.PickAction.values().length];
            try {
                iArr[VkWebFileChooserImpl.PickAction.ACTION_CAMERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkWebFileChooserImpl.PickAction.ACTION_GALLERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkWebFileChooserImpl.PickAction.ACTION_FILE_PICKER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: WebFileChooser.kt */
    public static final class b implements SuperappUiRouterBridge.e {
        public final /* synthetic */ VkWebFileChooserImpl.PickAction a;
        public final /* synthetic */ hgx0 b;
        public final /* synthetic */ VkWebFileChooserImpl.a c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ boolean e;

        /* compiled from: WebFileChooser.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[VkWebFileChooserImpl.PickAction.values().length];
                try {
                    iArr[VkWebFileChooserImpl.PickAction.ACTION_CAMERA.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[VkWebFileChooserImpl.PickAction.ACTION_GALLERY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[VkWebFileChooserImpl.PickAction.ACTION_FILE_PICKER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public b(VkWebFileChooserImpl.PickAction pickAction, hgx0 hgx0Var, VkWebFileChooserImpl.a aVar, boolean z, boolean z2) {
            this.a = pickAction;
            this.b = hgx0Var;
            this.c = aVar;
            this.d = z;
            this.e = z2;
        }

        @Override // com.vk.superapp.bridges.SuperappUiRouterBridge.e
        public final void a() {
            this.b.l();
        }

        @Override // com.vk.superapp.bridges.SuperappUiRouterBridge.e
        public final void b() {
            int i = a.$EnumSwitchMapping$0[this.a.ordinal()];
            VkWebFileChooserImpl.a aVar = this.c;
            hgx0 hgx0Var = this.b;
            if (i == 1) {
                hgx0Var.h(aVar.b, aVar.a);
            } else if (i == 2) {
                hgx0Var.j(this.d, this.e, aVar);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                hgx0Var.k();
            }
        }
    }

    public hgx0(FragmentImpl fragmentImpl) {
        super(fragmentImpl, "com.vk.common.VKFileProvider");
        this.e = fragmentImpl;
        this.f = true;
    }

    @Override // com.vk.superapp.browser.internal.utils.VkWebFileChooserImpl, xsna.n1w0
    public final void a(Intent intent, boolean z, izs<? super Uri, s3q0> izsVar) {
        Uri uri;
        Bundle bundleExtra;
        Bundle extras;
        ArrayList<String> stringArrayList;
        if ((intent != null ? intent.getData() : null) == null) {
            String str = (intent == null || (extras = intent.getExtras()) == null || (stringArrayList = extras.getStringArrayList("files")) == null) ? null : (String) j5g.a0(stringArrayList);
            if (str == null || str.length() == 0) {
                ArrayList parcelableArrayList = (intent == null || (bundleExtra = intent.getBundleExtra("result_attachments")) == null) ? null : bundleExtra.getParcelableArrayList("result_files");
                if ((parcelableArrayList != null ? parcelableArrayList.size() : 0) > 1) {
                    Uri[] uriArr = (Uri[]) parcelableArrayList.toArray(new Uri[0]);
                    ValueCallback<Uri[]> valueCallback = this.c;
                    if (valueCallback != null) {
                        valueCallback.onReceiveValue(uriArr);
                    }
                    this.c = null;
                    return;
                }
                uri = parcelableArrayList != null ? (Uri) j5g.b0(0, parcelableArrayList) : null;
            } else {
                uri = Uri.parse(str);
            }
            if (uri != null && epx.f(MimeTypeMap.getFileExtensionFromUrl(uri.toString()), "jpg")) {
                try {
                    Uri a2 = ((f8r) i2w.a().a.a.k.invoke()).a(this.e.requireContext(), uri, com.vk.core.files.a.s(), null);
                    if (intent != null) {
                        intent.setData(a2);
                    }
                } catch (Throwable th) {
                    com.vk.metrics.eventtracking.b.a.a(th);
                    return;
                }
            } else if (intent != null) {
                intent.setData(uri);
            }
        }
        super.a(intent, z, izsVar);
    }

    @Override // com.vk.superapp.browser.internal.utils.VkWebFileChooserImpl, xsna.n1w0
    public final void c(int i, Intent intent, boolean z) {
        if (!z) {
            l();
            return;
        }
        File l = vua0.l(i);
        if (l != null) {
            FragmentImpl fragmentImpl = this.e;
            io.reactivex.rxjava3.internal.operators.single.b0 m = com.vk.core.files.b.c(new com.vk.core.files.b(fragmentImpl.requireContext().getApplicationContext()), l, null, 6).m(io.reactivex.rxjava3.android.schedulers.a.b());
            f0o0 f0o0Var = new f0o0(new hi3(this, z, 3), 7);
            int i2 = kwg0.a;
            itg0.c(m.subscribe(f0o0Var, new hwg0()), fragmentImpl);
        }
    }

    @Override // com.vk.superapp.browser.internal.utils.VkWebFileChooserImpl, xsna.n1w0
    public final boolean d(int i) {
        return ll9.b.containsKey(Integer.valueOf(i)) && ll9.c.containsKey(Integer.valueOf(i));
    }

    @Override // com.vk.superapp.browser.internal.utils.VkWebFileChooserImpl
    public final boolean e() {
        return false;
    }

    @Override // com.vk.superapp.browser.internal.utils.VkWebFileChooserImpl
    public final void f(boolean z, VkWebFileChooserImpl.a aVar, VkWebFileChooserImpl.PickAction pickAction, boolean z2) {
        SuperappUiRouterBridge.Permission permission;
        int i = a.$EnumSwitchMapping$0[pickAction.ordinal()];
        if (i == 1) {
            permission = SuperappUiRouterBridge.Permission.CAMERA_AND_DISK;
        } else if (i == 2) {
            permission = SuperappUiRouterBridge.Permission.DISK;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            permission = SuperappUiRouterBridge.Permission.DISK;
        }
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        superappUiRouterBridge.k0(permission, new b(pickAction, this, aVar, z, z2));
    }

    @Override // com.vk.superapp.browser.internal.utils.VkWebFileChooserImpl
    public final boolean g() {
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.superapp.browser.internal.utils.VkWebFileChooserImpl
    public final void h(boolean z, boolean z2) {
        FragmentImpl fragmentImpl = this.e;
        Context requireContext = fragmentImpl.requireContext();
        qg90 i = vua0.i(z2);
        Intent intent = z ? new Intent("android.media.action.IMAGE_CAPTURE") : z2 ? new Intent("android.media.action.VIDEO_CAPTURE") : new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", com.vk.core.files.a.N((File) i.b));
        if (intent.resolveActivity(requireContext.getPackageManager()) != null) {
            int intValue = ((Number) i.a).intValue();
            LayoutInflater.Factory activity = fragmentImpl.getActivity();
            ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
            ww50<?> Y = ey50Var != null ? ey50Var.Y() : null;
            if (Y == null || !Y.q(intValue, intent, fragmentImpl)) {
                fragmentImpl.startActivityForResult(intent, intValue, null);
            }
        }
    }

    @Override // com.vk.superapp.browser.internal.utils.VkWebFileChooserImpl
    public final void j(boolean z, boolean z2, VkWebFileChooserImpl.a aVar) {
        boolean z3;
        boolean z4 = aVar.a;
        int i = 111;
        if (!aVar.c && (!(z3 = aVar.b) || !z4)) {
            if (z3) {
                i = Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE;
            } else if (z4) {
                i = 333;
            }
        }
        gvn.a(gvn.a, this.e, z2 ? Integer.MAX_VALUE : 1, z, 0, i, 16);
    }

    @Override // com.vk.superapp.browser.internal.utils.VkWebFileChooserImpl
    public final void k() {
        oz50 cVar;
        jbs jbsVar = new jbs(this.e);
        ArrayList<String> arrayList = new ArrayList<>();
        if (gz80.a(30)) {
            cVar = new ExternalFilePickerFragment.a();
            Bundle bundle = cVar.j;
            bundle.putLong("size_limit", 10737418240L);
            bundle.putStringArrayList("unavailable_extensions", arrayList);
        } else {
            cVar = new FilePickerFragment.c(FilePickerFragment.class, null, null);
            Bundle bundle2 = cVar.j;
            bundle2.putLong("size_limit", 10737418240L);
            bundle2.putStringArrayList("unavailable_extensions", arrayList);
        }
        cVar.s(true);
        cVar.f = false;
        cVar.i(jbsVar, 101);
    }
}
