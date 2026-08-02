package com.vkontakte.android.fragments.debug;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.FragmentImpl;
import com.vkontakte.android.R;
import java.util.List;
import xsna.e43;
import xsna.mcr0;
import xsna.n330;
import xsna.o330;

/* compiled from: NetworkImagesStatTestFragment.kt */
/* loaded from: classes7.dex */
public final class NetworkImagesStatTestFragment extends FragmentImpl {
    public static final List<String> P = e43.l("https://sun9-27.userapi.com/c858424/v858424777/1cefa/NcjN9VIKsmk.jpg", "https://sun9-49.userapi.com/c628727/v628727924/1d64b/3PDsglwHSiA.jpg", "https://sun9-52.userapi.com/c852028/v852028024/42d17/Kyh6t7dF6J4.jpg", "https://sun9-70.userapi.com/c626625/v626625146/2800c/fSNpiZKQGSg.jpg", "https://sun9-10.userapi.com/c855624/v855624809/12d5b3/XCAkMyDXblc.jpg", "https://sun9-13.userapi.com/c622126/v622126377/34fe3/DH6esaEzKOg.jpg", "https://sun9-69.userapi.com/c850124/v850124790/1d3a80/35Mtn-PZogM.jpg", "https://sun9-67.userapi.com/c855416/v855416579/187884/QT59b4s-MKA.jpg", "https://sun9-55.userapi.com/c858420/v858420472/1dc14f/tY5-o9YVtVc.jpg", "https://sun9-62.userapi.com/iZmRz9w51ArPzK0HizOHyn-CeGnd4c8P7Sf_BA/yx5gjQTbGq4.jpg", "https://sun9-43.userapi.com/c857736/v857736834/1de06/5rlV2hv8Hls.jpg", "https://sun9-15.userapi.com/nGr2wn4xuZAJc00UJ5OizxKRDIRGwX1seFfStA/szhWG7zkzR4.jpg", "https://sun9-12.userapi.com/c853524/v853524130/30803/6Gobg8703v0.jpg", "https://sun9-54.userapi.com/SIKiw9NPHpVVUSZSud4DfKOmQxt29C4Zu2Koeg/46lzQMV3h9o.jpg", "https://sun9-53.userapi.com/c855432/v855432476/1124f4/IyOWfTctSlQ.jpg", "https://sun9-68.userapi.com/o1VjWfcjX0rczDvT2ARyK272oq3Sw0tqv5e37w/SHushidpr_w.jpg", "https://sun9-67.userapi.com/c855436/v855436534/1ba2a0/smygVuXckFc.jpg", "https://sun9-30.userapi.com/c844722/v844722616/cbbab/4nF7baW6NoM.jpg", "https://sun9-55.userapi.com/nxT0AgtAP4sry0btwpTrVrEkwqY6o-8Pa7pkXw/IJFJKoFbz4Y.jpg", "https://sun9-19.userapi.com/c857624/v857624144/20d4bd/ob6b4G04ZQc.jpg", "https://sun9-38.userapi.com/7Hv6Kz3glK7QiySmmHD9kWrPUnFRsQtYrkTv2g/p1asJzZCwEo.jpg", "https://sun9-21.userapi.com/Lv7cOZm3zo4k0WDtwtKxyZq_hTq0IPSjxc84Hw/sVAo-4aysPo.jpg", "https://sun9-34.userapi.com/c848532/v848532392/1387d7/CxD4qxKt-E8.jpg", "https://sun9-64.userapi.com/c841629/v841629884/290a6/d40g9GxvhNE.jpg", "https://sun9-11.userapi.com/c845416/v845416737/d970f/jwrs6uByVS8.jpg", "https://sun9-71.userapi.com/c841427/v841427114/510f8/5edU36cos4s.jpg", "https://sun9-50.userapi.com/rg3J4bHXD0PIqVC8G77n7asN4-229sLJD9O5Ow/fCLB94NB2bg.jpg", "https://sun9-44.userapi.com/c850520/v850520742/1bdf7a/k_AEAooLmDc.jpg", "https://sun9-66.userapi.com/FabGdGwlCfymgVJivFxSRPdh0K-jQKF1osD4gQ/4vrOsCi3Ok0.jpg", "https://sun9-37.userapi.com/c852136/v852136396/1571bf/sIXx2CH-x_Y.jpg", "https://sun9-45.userapi.com/c851236/v851236047/3725/tGm2tuhakpk.jpg", "https://sun9-52.userapi.com/c610/u4363126/a_d744ddb2.jpg", "https://sun9-37.userapi.com/c855120/v855120383/2859d/tvOtZ5jkrjM.jpg", "https://sun9-46.userapi.com/c849336/v849336910/9c627/q4OSq9tBPLU.jpg", "https://sun9-10.userapi.com/c857636/v857636437/a0c58/wEOV0wjACNY.jpg", "https://sun9-32.userapi.com/5gNg5MsUTGc8KF6roKlYZ8hiv6BcoWGuHFD7ag/pAsyudWP_8M.jpg", "https://sun9-72.userapi.com/JcQ-H7wGpqzkBTUx0JQej379cbzZSsPXRE3gPg/UXWVw1hSOm4.jpg", "https://sun9-55.userapi.com/c846220/v846220567/b73d8/cyYmsIhrbhY.jpg", "https://sun9-58.userapi.com/c855432/v855432012/9f6b2/Ctj3vpbwlfg.jpg", "https://sun9-14.userapi.com/4LpCjtSrS1q4tEeNVzoLKS6DpKvcI7tJF_X3qg/XFETKW87724.jpg", "https://sun9-2.userapi.com/c857724/v857724006/e97a0/vgVEtYzxN4g.jpg", "https://sun9-11.userapi.com/Oq2doy-9yd1-7IePjoki4zcaud3Xyy5vnzBIaA/J6PSBUjrNDE.jpg", "https://sun9-2.userapi.com/BOvFLKWExTqEZVAcNV6b41iopInlfa3nf7T9aA/gVQvbMX3vhI.jpg", "https://sun9-17.userapi.com/c848632/v848632125/bf587/S06qlfsa0no.jpg", "https://sun9-69.userapi.com/c623918/v623918045/252d6/-BeRU0P5gR4.jpg", "https://sun9-34.userapi.com/c854324/v854324915/ad978/mOyCG8O8Hu4.jpg", "https://sun9-41.userapi.com/c850636/v850636234/1956f0/ds8__ViEDf8.jpg", "https://sun9-34.userapi.com/LiK4mP_mIeihz5JA9wiHH1ZRbMYq-vJqzhXCqg/Y3RjTSfzMc4.jpg", "https://sun9-62.userapi.com/sqhSqv2fsTrRkFYIKtCKVKDDOtfWbEwJWxlhtw/2r0TfwGoK94.jpg", "https://sun9-43.userapi.com/wtmbTo6zmkZdLAkSPwjus0HcGYiZFk5Rv2E0Vw/SAGxz56v_Wg.jpg", "https://sun9-72.userapi.com/-s-gm8tj9s0j4JLcOZmA8lnhmUJufveqdrBSKA/rGAgiMRzQf8.jpg", "https://sun9-15.userapi.com/BP7Z5mlatGQmqrCAvkutxaUpSdMd4SqokfhvMA/iHHc08nKzSg.jpg", "https://sun9-27.userapi.com/c841526/v841526223/28313/_liru64BN6I.jpg", "https://sun9-33.userapi.com/c206628/v206628980/76363/Pm32_yCAbFE.jpg", "https://sun9-56.userapi.com/ueVgtATPJ8W7MpZgq4LK-iw7d77OsU6CcDPbvQ/cuw8xmKErs0.jpg", "https://sun9-5.userapi.com/E7cpdpIngyIhVucWe5_BjFVsShyz6-pg-_4VQA/__nXEE5tqHI.jpg", "https://sun9-19.userapi.com/c834303/v834303475/157d81/O6clB46qo5M.jpg", "https://sun9-63.userapi.com/c633421/v633421489/569a/pALM-fd4-Ak.jpg", "https://sun9-68.userapi.com/c626131/v626131142/383b2/Nqob-SRv_Xs.jpg", "https://sun9-8.userapi.com/c852216/v852216587/a597c/HdSH9yVQrMQ.jpg", "https://sun9-50.userapi.com/c850120/v850120519/16876d/kd8ugt1O7qw.jpg", "https://sun9-23.userapi.com/c858020/v858020908/22b36/W--vn77evT4.jpg", "https://sun9-8.userapi.com/c850724/v850724644/193b46/5CaPlqjHs6M.jpg", "https://sun9-6.userapi.com/8Loskm0XkYzQ4WoYYtNs_iGQVGe74R59Kv5E1Q/Gc4_13sieGs.jpg", "https://sun9-43.userapi.com/c840426/v840426347/1ea64/uyXkwdTH90A.jpg", "https://sun9-50.userapi.com/_gGlXhP1VtNj3XiW6ozzzuA-nOuIJ8BmVUiEGA/Qhx-z_M9dJo.jpg", "https://sun9-70.userapi.com/c831309/v831309917/14e79b/9okZq4g1P_s.jpg", "https://sun9-30.userapi.com/c858428/v858428666/81bc8/24SUdQ-Dqno.jpg", "https://sun9-14.userapi.com/c858128/v858128106/cf72e/PXEPVhLrsUM.jpg", "https://sun9-19.userapi.com/c855432/v855432632/6c729/hZX0BQngo38.jpg", "https://sun9-62.userapi.com/c631528/v631528422/12ed0/mxMioTeuCqE.jpg", "https://sun9-16.userapi.com/c854128/v854128088/1ea4e9/eNmLnlKab1Y.jpg", "https://sun9-6.userapi.com/J69tA3tLUIWcYvxbBZJOpLUomBuxFCMhvL6YVw/5N1SljTfnLo.jpg", "https://sun9-55.userapi.com/c857524/v857524160/2cd44/26BLY4qdSBY.jpg", "https://sun9-56.userapi.com/c845218/v845218339/74933/tIgle7he9sA.jpg", "https://sun9-5.userapi.com/OBwjHqxOvx9UM7EmtRklQV2srquprPLeDfoCqw/gUof3-33GX0.jpg", "https://sun9-36.userapi.com/klCMq1YptlK_O6PvtKrQaiuwXVP6Lu9wB_hI5w/BTdfdIbFG68.jpg", "https://sun9-48.userapi.com/c846321/v846321722/20b57/IjOcHeYgZ4g.jpg", "https://sun9-52.userapi.com/YBizA7PJGhIZZiiaLXseS9RQX08BgevXyqFQ9A/86z8TKviOT8.jpg", "https://sun9-44.userapi.com/c857524/v857524451/1abbb7/vW7nuY2xeO0.jpg", "https://sun9-41.userapi.com/VSf9fFmwb-rTU7Shg0qybyogaA6OairOqe0gnw/7KJWZYvxXPU.jpg", "https://sun9-47.userapi.com/VYLhfLeVbL4f5wOuY3tdZl9fazvm-VaqYgsHgA/IfkVyVrRMy4.jpg", "https://sun9-16.userapi.com/c846218/v846218553/1e44a7/4ELJHuk0fSA.jpg", "https://sun9-62.userapi.com/HglRZQsHyYV5vh7JXzgD4vJfZGhoNgDhay4WHg/fN6kt5V-TZw.jpg", "https://sun9-58.userapi.com/pZ7FbSFWebtho80RHDDTV7YSLXzZQHwP71qK_w/T4E2_Bsu1tc.jpg", "https://sun9-63.userapi.com/Qq53zRQNB-YRVfk3XWQWdMEZbB9yl_K61gicjA/01nemi0TQL8.jpg", "https://sun9-24.userapi.com/laVlrnQD6v_ITtLrTZpSDY9QlPtlKN1ZbTafyQ/VyQJH9U0Af4.jpg", "https://sun9-43.userapi.com/c845021/v845021895/100e1d/GKGJLkGuURk.jpg", "https://sun9-44.userapi.com/c850436/v850436209/137d91/T8huAdxqgOc.jpg", "https://sun9-53.userapi.com/_S79p1KodAwvz-HyakpyXDrnybMROBlLG1cvQw/dhua_OXfbwI.jpg", "https://sun9-72.userapi.com/c850016/v850016455/1c5a66/UNmIK490cIQ.jpg", "https://sun9-30.userapi.com/c626125/v626125459/1a35a/bLItQxFn2_s.jpg", "https://sun9-45.userapi.com/zqkY7BYoodqGQ4q5ATxXh0s8FjHO32XyHuCKaQ/HfSSJK-BUgU.jpg", "https://sun9-66.userapi.com/vhASBOgvhYuCs117lYmpD2Ihe2n53OsbXrDDiQ/18q-43_lh4Y.jpg", "https://sun9-21.userapi.com/c841531/v841531173/4970d/ZlKDsOFhV6Q.jpg", "https://sun9-26.userapi.com/9DILmZfm01LWC4anCcFHeNqZ1Q6GrsWPygsAOg/oDDRjqepiDw.jpg", "https://sun9-65.userapi.com/c846018/v846018485/1e292b/n6lu1xMkZ4g.jpg", "https://sun9-18.userapi.com/N-cMUUACx1Aq4xMKidJdPUbPwoGFNTHjYaGFIQ/C9o9GKS14dg.jpg", "https://sun9-61.userapi.com/c854020/v854020581/1017a5/j5sGUNt9spA.jpg", "https://sun9-45.userapi.com/nOuNbJtp0h3tGhX_3e4hkdn9TTFcW-RjOYcBgg/cowr3UzogWA.jpg");
    public RecyclerView N;
    public final c O = new c();

    /* compiled from: NetworkImagesStatTestFragment.kt */
    public static final class a extends RecyclerView.e0 {
        public final ImageView l;

        public a(ImageView imageView) {
            super(imageView);
            this.l = imageView;
        }
    }

    /* compiled from: NetworkImagesStatTestFragment.kt */
    public static final class b extends RecyclerView.n {
        public final int b = 20;

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
            int i2 = this.b;
            rect.left = i2;
            rect.right = i2;
            rect.bottom = i2;
            rect.top = i2;
        }
    }

    /* compiled from: NetworkImagesStatTestFragment.kt */
    public static final class c extends RecyclerView.Adapter<a> {
        public final boolean[] c;
        public final int[] d;
        public int e;

        public c() {
            List<String> list = NetworkImagesStatTestFragment.P;
            this.c = new boolean[list.size()];
            this.d = new int[list.size()];
            this.e = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return NetworkImagesStatTestFragment.P.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(a aVar, int i) {
            a aVar2 = aVar;
            String str = NetworkImagesStatTestFragment.P.get(i);
            Bitmap k = mcr0.k(str);
            if (k == null) {
                mcr0.h(Uri.parse(str)).r0(io.reactivex.rxjava3.schedulers.a.b()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new o330(new n330(i, 2, aVar2, this, NetworkImagesStatTestFragment.this), 3));
            } else {
                aVar2.l.setImageBitmap(k);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new a(new ImageView(NetworkImagesStatTestFragment.this.getActivity()));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.debug_network_images_stat_test_fragment_view, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.network_images_container);
        this.N = recyclerView;
        getActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        RecyclerView recyclerView2 = this.N;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.addItemDecoration(new b());
        RecyclerView recyclerView3 = this.N;
        (recyclerView3 != null ? recyclerView3 : null).setAdapter(this.O);
        return inflate;
    }
}
